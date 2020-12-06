package com.pfe.models;

import javax.persistence.*;

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

    @OneToOne(mappedBy = "qrCode")
    private Scan scan;

    public Qrcode(){

    }

    public Qrcode(Location location){
        this.location = location;
    }

    public Qrcode(Physician physician){
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

    public void setId(long id) {
        this.id = id;
    }

    public Scan getScan() {
        return scan;
    }

    public void setScan(Scan scan) {
        this.scan = scan;
    }
    
    public void setLocation(Location location) {
    	this.location=location;
    }
    

	public Location getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "Qrcode [id=" + id + ", physician=" + physician + ", location=" + location + ", scan=" + scan + "]";
	}
    
    
}
