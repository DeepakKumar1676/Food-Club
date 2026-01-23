package com.dev.Food_Club.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="restaurant_entity")
public class RestaurantEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private Long restaurantId;
    private String restaurantname;
    private String ownername;
    private String location;
    private int rating;
    @Column(name="opening_time")
    private String openingTime;
    @Column(name="closing_time")
    private String closingTime;

    @OneToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER,mappedBy ="restaurant")
    private List<MenuEntity> menuEntityList;

    public RestaurantEntity(){}

    public List<MenuEntity> getMenuEntityList() {
        return menuEntityList;
    }

    public void setMenuEntityList(List<MenuEntity> menuEntityList) {
        this.menuEntityList = menuEntityList;
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

    public void setRestaurantId(Long id) {
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
