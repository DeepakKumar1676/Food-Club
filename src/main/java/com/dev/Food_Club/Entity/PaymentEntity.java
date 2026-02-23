package com.dev.Food_Club.Entity;

import com.dev.Food_Club.enums.PaymentMethod;
import com.dev.Food_Club.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
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
    private Long selectedMenuId;
    private String itemName;
    private Integer itemQuantity;
    private Double itemPrice;
    private Double totalAmount;
    @Column(name="discount(%)")
    private Integer discount;
    private Double grandTotal;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    private LocalDateTime time;

}
