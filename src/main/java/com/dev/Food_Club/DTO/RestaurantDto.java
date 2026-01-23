package com.dev.Food_Club.DTO;
import com.dev.Food_Club.Entity.MenuEntity;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter

@JsonPropertyOrder({
        "restaurantId",
        "restaurantname",
        "ownername",
        "location",
        "openingTime",
        "closingTime",
        "rating",
        "menuList"
})
public class RestaurantDto {
    private Long restaurantId;
    private String restaurantname;
    private String ownername;
    private String location;
    private int rating;
    private String openingTime;
    private String closingTime;
    private List<MenuDto> menuList;

    public List<MenuDto> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<MenuDto> menuList) {
        this.menuList = menuList;
    }


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

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
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



