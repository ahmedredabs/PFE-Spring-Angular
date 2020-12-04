package com.pfe.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "citizens")
public class Citizen {
	@Id
	@GeneratedValue
	private long id;
	@Column
	private boolean isAlerted;
	@Column(nullable = true)
	private String name;

	public Citizen(boolean isAlerted) {
		this.isAlerted = isAlerted;
	}

	public Citizen() {

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
}
