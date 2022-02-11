package com.clean_architecture.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.clean_architecture.domain.entities.User;

@Service
public interface UserRespos extends JpaRepository<User, Long> { 
	
	
}