package com.fsm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsm.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
