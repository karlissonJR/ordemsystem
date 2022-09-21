package com.karlisson.ordersystem.repositories;

import com.karlisson.ordersystem.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
