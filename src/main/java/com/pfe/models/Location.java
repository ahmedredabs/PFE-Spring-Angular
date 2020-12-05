package com.pfe.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.boot.jackson.JsonComponent;

import javax.persistence.*;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "establishment_id", referencedColumnName = "id")
    private Establishment establishment;

    @OneToOne(mappedBy = "location", cascade = CascadeType.ALL)
    private QRCode qrCode;

    @Column
    private String name;

    @Column
    private String description;

    public Location() {

    }

    public Location(Establishment establishment) {
        this.establishment = establishment;
    }

    public Location(Establishment establishment, String name, String description) {
        new Location(establishment);
        this.name = name;
        this.description = description;
    }

    public long getEstablishment() {
        return establishment.getId();
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public QRCode getQrCode() {
        return qrCode;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }
}
