package com.pabbraga.peritech.repositories;

import com.pabbraga.peritech.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
