package com.clean_architecture.domain.common;
import javax.persistence.Id;

 
public class Identifier<T> {

	@Id
	protected
	T id;
	 
	
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
 
	
}
