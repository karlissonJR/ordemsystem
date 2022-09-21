package com.karlisson.ordersystem.repositories;

import com.karlisson.ordersystem.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
