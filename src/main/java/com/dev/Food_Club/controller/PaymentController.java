package com.dev.Food_Club.Controller;

import com.dev.Food_Club.DTO.PaymentRequestDto;
import com.dev.Food_Club.DTO.PaymentResponseDto;
import com.dev.Food_Club.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/food-club/api")
public class PaymentController {

    @Autowired
    PaymentService paymentservice;

    @PostMapping("/{restaurantId}")
    public ResponseEntity<PaymentResponseDto> createPayment(@RequestBody PaymentRequestDto paymentRequest, @PathVariable ("restaurantId") Long restaurantId){

        System.out.println("Restaurant id: "+restaurantId );
       PaymentResponseDto dto=paymentservice.savePayment(paymentRequest,restaurantId);
       return  ResponseEntity.ok(dto);
    }


}
