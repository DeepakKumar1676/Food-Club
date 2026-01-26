package com.dev.Food_Club.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="menu_entity")
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name="half_plate")
    private int halfPlate;
    @Column(name="full_plate")
    private int fullPlate;
    @Column(name="half_price")
    private double halfPrice;
    @Column(name="full_price")
    private double fullPrice;

    @ManyToOne
    @JoinColumn(name = "restaurant_id_fk",nullable = false)
    private RestaurantEntity restaurant;


//    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
//    private OrderEntity orderEntity;

    public void setRestaurant(RestaurantEntity restaurant) {
        this.restaurant = restaurant;
    }
    public RestaurantEntity getRestaurant() {
        return restaurant;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHalfPlate(int halfPlate) {
        this.halfPlate = halfPlate;
    }

    public void setFullPlate(int fullPlate) {
        this.fullPlate = fullPlate;
    }

    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
    }

    public void setHalfPrice(double halfPrice) {
        this.halfPrice = halfPrice;
    }

    public MenuEntity(){

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHalfPlate() {
        return halfPlate;
    }

    public int getFullPlate() {
        return fullPlate;
    }

    public double getHalfPrice() {
        return halfPrice;
    }

    public double getFullPrice() {
        return fullPrice;
    }
}
