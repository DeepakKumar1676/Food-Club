package com.dev.Food_Club.Service;

import com.dev.Food_Club.DTO.SelectedMenuDto;
import com.dev.Food_Club.Entity.MenuEntity;
import com.dev.Food_Club.Entity.RestaurantEntity;
import com.dev.Food_Club.Entity.SelectedMenuEntity;
import com.dev.Food_Club.Repository.MenuRepository;
import com.dev.Food_Club.Repository.RestaurantRepository;
import com.dev.Food_Club.Repository.SelectedMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SelectedMenuService {

    @Autowired
    SelectedMenuRepository selectedMenuRepository;

    @Autowired
    RestaurantRepository restaurantRepository;

    @Autowired
    MenuRepository menuRepository;

    public Map<String,Object> saveMenuItem(Long restaurantId, List<SelectedMenuDto> selectedMenuRequest){

        RestaurantEntity restaurant=restaurantRepository.findById(restaurantId).orElseThrow(()->new RuntimeException("Restaurant not found"));

        List<SelectedMenuDto> selectedMenuDto=new ArrayList<>();
        double grandTotal=0.0;

        for(SelectedMenuDto dto:selectedMenuRequest) {

            MenuEntity menu = menuRepository.findById(dto.getMenuId()).orElseThrow(() -> new RuntimeException("Menu not found"));

            double itemTotal = menu.getFullPrice() * dto.getQuantity();
            grandTotal = grandTotal + itemTotal;

            SelectedMenuEntity selectedMenuEntity = new SelectedMenuEntity();
            selectedMenuEntity.setRestaurantId(restaurantId);
            selectedMenuEntity.setMenuId(menu.getId());
            selectedMenuEntity.setName(menu.getName());
            selectedMenuEntity.setPrice(menu.getFullPrice());
            selectedMenuEntity.setQuantity(dto.getQuantity());
            selectedMenuEntity.setTotalAmount(itemTotal);

            selectedMenuRepository.save(selectedMenuEntity);

            SelectedMenuDto menuList=new SelectedMenuDto();
            menuList.setMenuId(selectedMenuEntity.getMenuId());
            menuList.setName(selectedMenuEntity.getName());
            menuList.setPrice(selectedMenuEntity.getPrice());
            menuList.setQuantity(selectedMenuEntity.getQuantity());
            menuList.setTotalAmount(itemTotal);

            selectedMenuDto.add(menuList);
        }
        Map<String,Object> response =new HashMap<>();
        response.put("RestaurnatName",restaurant.getRestaurantname());
        response.put("GrandTotal",grandTotal);
        response.put("SelectedMenu",selectedMenuDto);

        return response;
    }
}
