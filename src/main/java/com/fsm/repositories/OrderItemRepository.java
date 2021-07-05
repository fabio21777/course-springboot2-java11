package com.fsm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsm.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
