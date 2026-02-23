package com.dev.Food_Club.Entity;

import com.dev.Food_Club.enums.PaymentMethod;
import com.dev.Food_Club.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="payment_Entity")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private UUID paymentId;

    private Long restaurnatId;
    private Double grandTotal;
    private Integer discount;

    private String itemName;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    private Long selectedMenuId;

}
