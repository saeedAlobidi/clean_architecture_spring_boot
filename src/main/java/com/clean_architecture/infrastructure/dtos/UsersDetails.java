package com.clean_architecture.infrastructure.dtos;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.clean_architecture.domain.entities.User;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UsersDetails implements UserDetails {

    private String userName;
    private String password;
    private boolean isEnabled;
    private boolean isAccountNonExpired;
    private boolean isAccountNonLocked;
    private boolean isCredentialsNonExpired;
    private List<GrantedAuthority> authorities;

    public UsersDetails(User user) {
        this.userName = user.getUserName();
        this.password = user.getPassword();
        this.isEnabled = user.getIsEnabled();
        this.isAccountNonExpired = user.getIsAccountNonExpired();
        this.isAccountNonLocked = user.getIsAccountNonLocked();
        this.isCredentialsNonExpired = user.getIsCredentialsNonExpired();
        
        this.authorities = Arrays.stream(user.getRoles().split(","))
                    .map(SimpleGrantedAuthority::new)
                    .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
}