package com.karlisson.ordersystem.repositories;

import com.karlisson.ordersystem.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
