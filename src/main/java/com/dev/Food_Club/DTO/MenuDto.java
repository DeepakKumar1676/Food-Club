package com.dev.Food_Club.DTO;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "id",
        "name",
        "fullPlate",
        "halfPlate",
        "fullPrice",
        "halfPrice"
})
public class MenuDto {

    private Long id;
    private String name;
    private int halfPlate;
    private int fullPlate;
    private double halfPrice;
    private double fullPrice;

    public MenuDto(){}

    public int getFullPlate() {
        return fullPlate;
    }

    public double getFullPrice() {
        return fullPrice;
    }

    public double getHalfPrice() {
        return halfPrice;
    }

    public int getHalfPlate() {
        return halfPlate;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setHalfPrice(double halfPrice) {
        this.halfPrice = halfPrice;
    }

    public void setId(Long id) {
        this.id = id;
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

}
