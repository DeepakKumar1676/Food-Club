package com.dev.Food_Club.Repository;

import com.dev.Food_Club.Entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PaymentRepository extends JpaRepository<PaymentEntity,Long> {
}
