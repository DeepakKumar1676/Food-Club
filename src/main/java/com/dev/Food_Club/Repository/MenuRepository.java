package com.dev.Food_Club.Repository;

import com.dev.Food_Club.Entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity ,Long> {

}
