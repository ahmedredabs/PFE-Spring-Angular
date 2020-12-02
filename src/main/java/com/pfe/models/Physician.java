package com.pfe.models;

import javax.persistence.*;

@Entity
@Table(name = "physicians")
public class Physician {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private String password;

    public Physician(){

    }

    public Physician(String name, String password){
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

}

