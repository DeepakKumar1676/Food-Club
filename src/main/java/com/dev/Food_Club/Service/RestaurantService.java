package com.dev.Food_Club.Service;
import com.dev.Food_Club.DTO.MenuDto;
import com.dev.Food_Club.DTO.RestaurantDto;
import com.dev.Food_Club.DTO.RestaurantResponseDto;
import com.dev.Food_Club.Entity.MenuEntity;
import com.dev.Food_Club.Entity.RestaurantEntity;
import com.dev.Food_Club.Repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantService{

    @Autowired
    RestaurantRepository restaurantRepository;

    public List<RestaurantDto> findAllRestaurant(String location){

       List<RestaurantEntity> entities=restaurantRepository.findByLocation(location);
       return entities.stream().map(entity -> {

                RestaurantDto dto = new RestaurantDto();
                dto.setRestaurantId(entity.getRestaurantId());
                dto.setRestaurantname(entity.getRestaurantname());
                dto.setOwnername(entity.getOwnername());
                dto.setLocation(entity.getLocation());
                dto.setRating(entity.getRating());
                dto.setOpeningTime(entity.getOpeningTime());
                dto.setClosingTime(entity.getClosingTime());
                return dto;

            }).collect(Collectors.toList());
    }

    public RestaurantDto getRestaurantDetailsWithManu(Long id){

        RestaurantEntity restaurant= restaurantRepository.findById(id)
               .orElseThrow(()->new RuntimeException("Restaurant not found"));
               //restaurant entity mapping to restaurantDto
        RestaurantDto restaurantDto=new RestaurantDto();
        restaurantDto.setRestaurantId(restaurant.getRestaurantId());
        restaurantDto.setRestaurantname(restaurant.getRestaurantname());
        restaurantDto.setOwnername(restaurant.getOwnername());
        restaurantDto.setLocation(restaurant.getLocation());
        restaurantDto.setOpeningTime(restaurant.getOpeningTime());
        restaurantDto.setClosingTime(restaurant.getClosingTime());
        restaurantDto.setRating(restaurant.getRating());

        List<MenuDto> menuDtoArrayList =new ArrayList<>();

        List<MenuEntity>menuEntities=restaurant.getMenuEntityList();
            for (MenuEntity menu : menuEntities) {
                MenuDto menuDto = new MenuDto();

                menuDto.setId(menu.getId());
                menuDto.setName(menu.getName());
                menuDto.setFullPlate(menu.getFullPlate());
                menuDto.setHalfPlate(menu.getHalfPlate());
                menuDto.setFullPrice(menu.getFullPrice());
                menuDto.setHalfPrice(menu.getHalfPrice());
                menuDtoArrayList.add(menuDto);
            }
            restaurantDto.setMenuList(menuDtoArrayList);
        return restaurantDto;
    }

    //logic when user hit api with restaurant id i am throwing only restaurant id and restaurant name

    public RestaurantResponseDto getRestaurant(Long id){

        RestaurantEntity restaurantEntity=restaurantRepository.findById(id).orElseThrow(()->new RuntimeException("Given Restaurant id is not found pls try again"));

        RestaurantResponseDto responseDto=new RestaurantResponseDto();
        responseDto.setRestaurantId(restaurantEntity.getRestaurantId());
        responseDto.setRestaurantname(restaurantEntity.getRestaurantname());


        List<MenuDto>menuList=new ArrayList<MenuDto>();

        List<MenuEntity> entities=restaurantEntity.getMenuEntityList();
        for(MenuEntity entity :entities){

            MenuDto menuDto=new MenuDto();
            menuDto.setId(entity.getId());
            menuDto.setName(entity.getName());
            menuDto.setHalfPlate(entity.getHalfPlate());
            menuDto.setFullPlate(entity.getFullPlate());
            menuDto.setHalfPrice(entity.getHalfPrice());
            menuDto.setFullPrice(entity.getFullPrice());
            menuList.add(menuDto);
        }
        responseDto.setMenuList(menuList);
        return responseDto;

    }


}
