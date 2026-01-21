package com.dev.Food_Club.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="menu_entity")
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private int halfPlate;

    @NotNull

    private int fullPlate;

    @NotNull
    private double halfPrice;

    @NotNull
    private double fullPrice;

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
