package com.dev.Food_Club.DTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RestaurantDto {
    private Long id;
    private String restaurantname;
    private String ownername;
    private String location;
    private int rating;
    private String openingTime;
    private String closingTime;

    public RestaurantDto(Long id,String restaurantname, String ownername, String location, int rating, String openingTime, String closingTime) {
        this.id=id;
        this.restaurantname = restaurantname;
        this.ownername = ownername;
        this.location = location;
        this.rating = rating;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }



}



