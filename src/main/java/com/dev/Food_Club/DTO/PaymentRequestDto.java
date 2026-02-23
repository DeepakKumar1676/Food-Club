package com.dev.Food_Club.DTO;
import com.dev.Food_Club.enums.PaymentMethod;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequestDto {

    @JsonProperty("selectedMenuId")
    private Long  selectedMenueId;
    private PaymentMethod paymentMethod;
    private Integer discount;

}
