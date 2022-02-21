package com.clean_architecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.clean_architecture.infrastructure.usecase.User;

@SpringBootApplication
public class CleanArchitectureApplication {

	
	@Autowired
	com.clean_architecture.infrastructure.usecase.User user;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(CleanArchitectureApplication.class, args);
		
	}
	
	
	 @Bean
	    public void initUser() {
		 this.user.insert(new com.clean_architecture.domain.entities.User());
	    }

}
