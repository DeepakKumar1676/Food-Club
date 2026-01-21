package com.dev.Food_Club.Repository;

import com.dev.Food_Club.Entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity ,Long> {

     List<RestaurantEntity> findByLocation(String location);

}
