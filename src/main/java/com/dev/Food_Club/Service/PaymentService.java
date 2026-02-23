package com.dev.Food_Club.Service;

import com.dev.Food_Club.DTO.PaymentRequestDto;
import com.dev.Food_Club.DTO.PaymentResponseDto;
import com.dev.Food_Club.Entity.PaymentEntity;
import com.dev.Food_Club.Entity.RestaurantEntity;
import com.dev.Food_Club.Entity.SelectedMenuEntity;
import com.dev.Food_Club.Repository.PaymentRepository;
import com.dev.Food_Club.Repository.RestaurantRepository;
import com.dev.Food_Club.Repository.SelectedMenuRepository;
import com.dev.Food_Club.enums.PaymentStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Autowired
    RestaurantRepository restaurantRepository;

    @Autowired
    SelectedMenuRepository selectedMenuRepository;

    public PaymentResponseDto savePayment(PaymentRequestDto paymentRequest, Long id){

       RestaurantEntity restaurant= restaurantRepository.findById(id).orElseThrow(()->new RuntimeException("restaurant not found"));
      //  System.out.println("Restaurant ID: " + id);

        System.out.println("SelectedMenuId form request: " + paymentRequest.getSelectedMenueId());
        SelectedMenuEntity menuEntity=selectedMenuRepository.findById(paymentRequest.getSelectedMenueId())
                .orElseThrow(()->new RuntimeException("selectedMenuId is not found"));

       PaymentEntity entity=new PaymentEntity();

        entity.setRestaurnatId(restaurant.getRestaurantId());
        entity.setPaymentMethod(paymentRequest.getPaymentMethod());
        entity.setPaymentStatus(PaymentStatus.SUCCESS);
        entity.setDiscount(10);
        entity.setGrandTotal(menuEntity.getTotalAmount());
        entity.setSelectedMenuId(paymentRequest.getSelectedMenueId());
        entity.setItemName(menuEntity.getName());
        paymentRepository.save(entity);

        PaymentResponseDto responseDto =new PaymentResponseDto();
        responseDto.setPaymentId(entity.getPaymentId());
        responseDto.setRestaurnatId(entity.getRestaurnatId());
        responseDto.setPaymentStatus(entity.getPaymentStatus());
        responseDto.setPaymentMethod(entity.getPaymentMethod());
        responseDto.setDiscount(10);
        responseDto.setGrandTotal(entity.getGrandTotal());
        responseDto.setSelectedMenuId(entity.getSelectedMenuId());
        responseDto.setItemName(entity.getItemName());

        return responseDto;

    }

}

