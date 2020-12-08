package com.pfe.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "qrcodes")
public class Qrcode {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "physician_id")
    private Physician physician;

    @OneToOne()
    @JoinColumn(name = "location_id",referencedColumnName = "id")
    private Location location;

    @OneToMany(mappedBy = "qrCode", orphanRemoval=true)
    private List<Scan> scans = new ArrayList<>();

    public Qrcode(){

    }

    public Qrcode(Location location){
        this.location = location;
    }

    public Qrcode(Physician physician){
        this.physician = physician;
    }

    public Physician getPhysician() {
        return physician;
    }
    public Location getLocation() {
		return location;
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

    public void setId(long id) {
        this.id = id;
    }

	public void setLocation(Location location) {
    	this.location=location;
    }
    
	@Override
	public String toString() {
		return "Qrcode [id=" + id + ", physician=" + physician + ", location=" + location + ", scan=" + scans + "]";
	}
    
    
}
