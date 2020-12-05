package com.pfe.models;

import javax.persistence.*;

@Entity
@Table(name = "qrcodes")
public class QRCode {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "physician_id")
    private Physician physician;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToOne(mappedBy = "qrCode")
    private Scan scan;

    public QRCode(){

    }

    public QRCode(Location establishment){
        this.location = establishment;
    }

    public QRCode(Physician physician){
        this.physician = physician;
    }

    public Location getLocationId() {
        return location;
    }

    public Physician getPhysician() {
        return physician;
    }

    public long getId() {
        return id;
    }

    public void setLocationId(Location locationId) {
        this.location = locationId;
    }

    public void setPhysician(Physician physicianId) {
        this.physician = physicianId;
    }
}
