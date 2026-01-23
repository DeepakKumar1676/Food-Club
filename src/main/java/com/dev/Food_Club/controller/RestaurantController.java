package com.dev.Food_Club.Controller;

import com.dev.Food_Club.DTO.RestaurantDto;
import com.dev.Food_Club.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/v1/food-club/api")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;
    @GetMapping("/restaurant")
    public ResponseEntity<List<RestaurantDto>> getRestaurant(
            @RequestParam String location){

       return ResponseEntity.ok(restaurantService.findAllRestaurant(location));

    }


    @GetMapping("/restaurant/{id}")

    public ResponseEntity<RestaurantDto> getRestaurantDetails(@PathVariable Long id){

        return ResponseEntity.ok(restaurantService.getRestaurantDetailsWithManu(id));
    }

}
