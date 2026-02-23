package com.dev.Food_Club.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="selected_menu")
public class SelectedMenuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long restaurantId;
    private Long menuId;
    private String name;
    private int quantity;
    private double price;


    private double totalAmount;

}
