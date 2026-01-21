package com.dev.Food_Club.Service;

import com.dev.Food_Club.DTO.MenuDto;
import com.dev.Food_Club.Entity.MenuEntity;
import com.dev.Food_Club.Repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService {

    @Autowired
    MenuRepository menuRepository;

    public List<MenuDto> fetchMenuDetails(){

      List< MenuEntity> entity=menuRepository.findAll();

      List<MenuDto> menuDtoList=new ArrayList<>();

        for(MenuEntity entites: entity){

            MenuDto menuDto =new MenuDto();

            menuDto.setId(entites.getId());
            menuDto.setName(entites.getName());
            menuDto.setFullPlate(entites.getFullPlate());
            menuDto.setHalfPlate(entites.getHalfPlate());
            menuDto.setFullPrice(entites.getFullPrice());
            menuDto.setHalfPrice(entites.getHalfPrice());
            menuDtoList.add(menuDto);
        }
        return menuDtoList;
    }

}
