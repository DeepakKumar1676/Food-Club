package com.dev.Food_Club.Controller;

import com.dev.Food_Club.DTO.MenuDto;
import com.dev.Food_Club.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/v1/food-club/api/order")
public class OrderController {

    @Autowired
    MenuService menuService;

    @GetMapping("/menu")
    public ResponseEntity<List<MenuDto>> getMenuDetails(){

        return ResponseEntity.ok( menuService.fetchMenuDetails());

    }




}
