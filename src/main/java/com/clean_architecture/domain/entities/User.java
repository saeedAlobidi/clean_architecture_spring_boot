package com.clean_architecture.domain.entities;

import javax.persistence.*;

 
 
@Entity
@Table(name="users")

public class User   {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String userName="saeed1adm@gmail.com";
	String age="28";
	String password="111";
	String roles="ADMIN";
	boolean  isAccountNonExpired=true;
	boolean  isAccountNonLocked=true;
	boolean  isCredentialsNonExpired=true;
	boolean  isEnabled=true;
 
	
	
	public User() {
		super();
	}




	public User(int id, String userName, String age, String password, String roles, boolean isAccountNonExpired,
			boolean isAccountNonLocked, boolean isCredentialsNonExpired, boolean isEnabled) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
		this.password = password;
		this.roles = roles;
		this.isAccountNonExpired = isAccountNonExpired;
		this.isAccountNonLocked = isAccountNonLocked;
		this.isCredentialsNonExpired = isCredentialsNonExpired;
		this.isEnabled = isEnabled;
	}


 

	public String getRoles() {
		return roles;
	}




	public void setRoles(String roles) {
		this.roles = roles;
	}




	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getUserName() {
		return userName;
	}



	public void setName(String name) {
		this.userName = name;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public boolean getIsAccountNonExpired() {
		return isAccountNonExpired;
	}



	public void setIsAccountNonExpired(boolean isAccountNonExpired) {
		this.isAccountNonExpired = isAccountNonExpired;
	}



	public boolean getIsAccountNonLocked() {
		return isAccountNonLocked;
	}



	public void setIsAccountNonLocked(boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}



	public boolean getIsCredentialsNonExpired() {
		return isCredentialsNonExpired;
	}



	public void setIsCredentialsNonExpired(boolean isCredentialsNonExpired) {
		this.isCredentialsNonExpired = isCredentialsNonExpired;
	}



	public boolean getIsEnabled() {
		return isEnabled;
	}



	public void setIsEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}



	 
 
	
}
