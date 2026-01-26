package com.dev.Food_Club.Controller;

import com.dev.Food_Club.DTO.SelectedMenuDto;
import com.dev.Food_Club.Service.SelectedMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController

public class SelectedMenuController {


    @Autowired
    SelectedMenuService selectedMenuService;

    @PostMapping("/select-menu/{restaurantId}")
    public Map<String,Object> saveSelectedMenu(@PathVariable Long restaurantId,
                                               @RequestBody List<SelectedMenuDto> selectedMenuRequest){

       return selectedMenuService.saveMenuItem(restaurantId,selectedMenuRequest);

    }

}
