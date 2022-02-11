package com.clean_architecture.domain.entities;

import javax.persistence.*;

import com.clean_architecture.domain.common.Identifier;

 
@Entity
@Table(name="users")

public class User   {

	@Id
	protected
	int id;
	String name;
	String age;
	public User(int id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public User() {
		super();
		 
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
 
	  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
