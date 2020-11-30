package com.pfe.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Greeting {
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String message;

	public Greeting() {
		
	}
	
	public Greeting(String message) {
		this.message=message;
	}
	
	public long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}
	
}
