package com.pfe.models;

import javax.persistence.*;

@Entity
@Table(name = "citizens")
public class Citizen {
	@Id
	@GeneratedValue
	private long id;
	@Column()
	private boolean isAlerted = false;
	@Column(nullable = true)
	private String name;

	public Citizen() {

	}

	public Citizen(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlerted() {
		return isAlerted;
	}

	public void setAlerted(boolean isAlerted) {
		this.isAlerted = isAlerted;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Citizen [id=" + id + ", isAlerted=" + isAlerted + ", name=" + name + "]";
	}
	
	
}
