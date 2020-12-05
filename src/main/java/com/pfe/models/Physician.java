package com.pfe.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @OneToMany(mappedBy = "physician", cascade = CascadeType.ALL)
    private Set<QRCode> qrcodes = new HashSet<>();

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

    public void setQrcodes(Set<QRCode> qrcodes){
        this.qrcodes = qrcodes;

        for(QRCode qrCode : qrcodes){
            qrCode.setPhysician(this);
        }
    }

}

