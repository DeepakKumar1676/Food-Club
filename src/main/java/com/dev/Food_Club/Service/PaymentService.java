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

import java.time.LocalDateTime;

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
        Integer discount=paymentRequest.getDiscount();

       System.out.println("discount passing in the payment request :"+discount);

        entity.setRestaurnatId(restaurant.getRestaurantId());
        entity.setPaymentMethod(paymentRequest.getPaymentMethod());
        entity.setPaymentStatus(PaymentStatus.SUCCESS);
        int RemainingPercentage=100-paymentRequest.getDiscount();
        entity.setDiscount(paymentRequest.getDiscount());
        entity.setGrandTotal(menuEntity.getTotalAmount()*RemainingPercentage/100);
        entity.setItemPrice(menuEntity.getPrice());
        entity.setTotalAmount(menuEntity.getTotalAmount());
        entity.setItemQuantity(menuEntity.getQuantity());
        entity.setSelectedMenuId(paymentRequest.getSelectedMenueId());
        entity.setItemName(menuEntity.getName());
        entity.setTime(LocalDateTime.now());
        paymentRepository.save(entity);

        PaymentResponseDto responseDto =new PaymentResponseDto();

        responseDto.setPaymentId(entity.getPaymentId());
        responseDto.setRestaurnatId(entity.getRestaurnatId());
        responseDto.setPaymentStatus(entity.getPaymentStatus());
        responseDto.setPaymentMethod(entity.getPaymentMethod());
        responseDto.setDiscount(entity.getDiscount());
        responseDto.setGrandTotal(entity.getGrandTotal());
        responseDto.setSelectedMenuId(entity.getSelectedMenuId());
        responseDto.setItemName(entity.getItemName());
        responseDto.setTime(entity.getTime());
        responseDto.setTotalAmount(entity.getTotalAmount());
        responseDto.setItemQuantity(entity.getItemQuantity());
        responseDto.setItemPrice(entity.getItemPrice());

        return responseDto;

    }

}

