package com.dev.Food_Club.Repository;

import com.dev.Food_Club.Entity.SelectedMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelectedMenuRepository extends JpaRepository<SelectedMenuEntity,Long> {

}
