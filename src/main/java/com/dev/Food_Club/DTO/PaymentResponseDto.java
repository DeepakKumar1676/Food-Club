package com.dev.Food_Club.DTO;

import com.dev.Food_Club.enums.PaymentMethod;
import com.dev.Food_Club.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponseDto {

    private UUID paymentId;
    private Long restaurnatId;
    private Double grandTotal;
    private Double itemPrice;
    private Integer itemQuantity;
    private Double totalAmount;
    private Integer discount;
    private PaymentStatus paymentStatus;
    private PaymentMethod paymentMethod;
    private Long selectedMenuId;
    private String itemName;
    private LocalDateTime time;

}
