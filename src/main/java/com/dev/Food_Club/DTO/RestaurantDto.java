package com.dev.Food_Club.DTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class RestaurantDto {
    private Long id;
    private String restaurantname;
    private String ownername;
    private String location;
    private int rating;
    private String openingTime;
    private String closingTime;

    public RestaurantDto(String restaurantname, String ownername, String location, int rating, String openingTime, String closingTime) {
        this.restaurantname = restaurantname;
        this.ownername = ownername;
        this.location = location;
        this.rating = rating;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public RestaurantDto(){

    }

    public String getRestaurantname() {
        return restaurantname;
    }

    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }

}



