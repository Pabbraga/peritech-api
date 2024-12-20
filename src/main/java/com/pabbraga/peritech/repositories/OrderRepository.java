package com.pabbraga.peritech.repositories;

import com.pabbraga.peritech.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
