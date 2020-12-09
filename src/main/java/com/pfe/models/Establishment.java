package com.pfe.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "establishments")
public class Establishment {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    private String name;

    @Column
    private String password;

    @OneToMany(mappedBy = "establishment", cascade = CascadeType.ALL,orphanRemoval=true)
    @JsonIgnore
    private Set<Location> locations = new HashSet<>();

    public Establishment() {

    }

    public Establishment(String name, String password){
        this.name = name;
        this.password = password;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public Set<Location> getLocations() {
        return locations;
    }

    public void setLocations(Set<Location> locations) {
        this.locations = locations;
    }

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Establishment [id=" + id + ", name=" + name + ", password=" + password + ", locations=" + locations
				+ "]";
	}
    
    
}
