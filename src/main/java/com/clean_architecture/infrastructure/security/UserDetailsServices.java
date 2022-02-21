package com.clean_architecture.infrastructure.security;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.clean_architecture.domain.entities.User;
import com.clean_architecture.infrastructure.dtos.UsersDetails;
import com.clean_architecture.infrastructure.repositories.UserRespos;

import java.util.Optional;

@Service
public class UserDetailsServices implements UserDetailsService  {

    @Autowired
    UserRespos userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
         Optional<User> user = this.userRepository.findByUserName(userName);

          user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + userName));

         return user.map(UsersDetails::new).get();
    	
    }
}