package com.dev.Food_Club.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String restaurantname;
    private String ownername;
    private String location;
    private int rating;
    private String openingTime;
    private String closingTime;

    public RestaurantEntity(String restaurantname, String ownername, String location, int rating, String openingTime, String closingTime) {
        this.restaurantname = restaurantname;
        this.ownername = ownername;
        this.location = location;
        this.rating = rating;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

}
