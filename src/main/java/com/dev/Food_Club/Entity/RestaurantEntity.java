package com.dev.Food_Club.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="restaurant_entity")
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "restaurantname")
    private String restaurantname;
    @Column(name="ownername")
    private String ownername;
    @Column(name="location")
    private String location;
    @Column(name="rating")
    private int rating;
    @Column(name="openingTime")
    private String openingTime;
    @Column(name="closingTime")
    private String closingTime;

    public RestaurantEntity(String restaurantname, String ownername, String location, int rating, String openingTime, String closingTime) {
        this.restaurantname = restaurantname;
        this.ownername = ownername;
        this.location = location;
        this.rating = rating;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public RestaurantEntity(){

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
