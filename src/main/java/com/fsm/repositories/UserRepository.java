package com.fsm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsm.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
