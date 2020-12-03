package com.pfe.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    private String name;

    @Column
    private String password;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private Set<QRCode> qrcodes = new HashSet<>();

    public Company() {

    }

    public Company(String name, String password){
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

    public void setQrcodes(Set<QRCode> qrcodes){
        this.qrcodes = qrcodes;

        for(QRCode qrCode : qrcodes){
            qrCode.setCompanyId(this);
        }
    }

}
