package com.clean_architecture.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1")
public class UserController {
	@Autowired
	com.clean_architecture.infrastructure.usecase.User user;
	
	 

     @GetMapping("/")
	public   List<com.clean_architecture.domain.entities.User> get() {
	   return this.user.get();
	}
	
     @PostMapping("/add")
   public Boolean add(@RequestBody  com.clean_architecture.domain.entities.User data) {
	   return this.user.insert(data);
	}
	
}
