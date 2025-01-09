package com.OrderManagementSystem.api.repositories;

import com.OrderManagementSystem.api.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

