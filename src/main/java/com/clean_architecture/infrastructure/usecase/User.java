package com.clean_architecture.infrastructure.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clean_architecture.infrastructure.repositories.UserRespos;

 

@Service
public class User {

	UserRespos user;

	
	@Autowired
	public User(UserRespos user) {
		super();
		this.user = user;
	}
	
	
	public Boolean insert (com.clean_architecture.domain.entities.User data) {
		
		this.user.save(data);
		return true;
		
	}
	public  List<com.clean_architecture.domain.entities.User> get () {
		
		
		return this.user.findAll();
		
	}
	
}
