package com.dev.Food_Club.Service;
import com.dev.Food_Club.DTO.RestaurantDto;
import com.dev.Food_Club.Entity.RestaurantEntity;
import com.dev.Food_Club.Repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
                dto.setId(entity.getId());
                dto.setRestaurantname(entity.getRestaurantname());
                dto.setOwnername(entity.getOwnername());
                dto.setLocation(entity.getLocation());
                dto.setRating(entity.getRating());
                dto.setOpeningTime(entity.getOpeningTime());
                dto.setClosingTime(entity.getClosingTime());
                return dto;

            }).collect(Collectors.toList());
    }
}
