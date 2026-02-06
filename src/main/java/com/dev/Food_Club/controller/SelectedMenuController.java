package com.dev.Food_Club.Controller;

import com.dev.Food_Club.DTO.SelectedMenuDto;
import com.dev.Food_Club.Service.SelectedMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path="/food_club/api/")

public class SelectedMenuController {


    @Autowired
    SelectedMenuService selectedMenuService;

    @PostMapping("/select-menu/{restaurantId}")
    public Map<String,Object> saveSelectedMenu(@PathVariable Long restaurantId,
                                               @RequestBody List<SelectedMenuDto> selectedMenuRequest){

       return selectedMenuService.saveMenuItem(restaurantId,selectedMenuRequest);

    }


    @PostMapping("v2/add-cart/{restaurantId}")
    public Map<String,Object> AddToCart(@PathVariable Long restaurantId,
                                               @RequestBody List<SelectedMenuDto> selectedMenuRequest){

        return selectedMenuService.saveMenuItem(restaurantId,selectedMenuRequest);

    }
}
