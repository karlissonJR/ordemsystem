package com.karlisson.ordersystem.repositories;

import com.karlisson.ordersystem.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
