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
    @JoinColumn(name = "establishment_id")
    private Establishment establishment;

    @OneToOne(mappedBy = "location", cascade = CascadeType.ALL,orphanRemoval=true)
    private Qrcode qrCode;

    @Column
    private String name;

    @Column
    private String description;

    public Location() {

    }

    public Location(long id){
        System.out.println("test 3");
    }

    public Location(Establishment establishment) {
        System.out.println("test 1");
        this.establishment = establishment;
    }

    public Location(Establishment establishment, String name, String description) {
        System.out.println("test 2");
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

    public Qrcode getQrCode() {
        return qrCode;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

	public void setQrCode(Qrcode qrCode) {
		
	    if (sameAsFormer(qrCode))
	        return;
	      //set new Qrcode
	      Qrcode oldQrcode = this.qrCode;
	      this.qrCode = qrCode;
	      //remove from the old location
	      if (oldQrcode!=null)
	    	  oldQrcode.setLocation(null);
	      //set myself into new qrcode account
	      if (qrCode!=null)
	    	  qrCode.setLocation(this);
	}
	
	  private boolean sameAsFormer(Qrcode newQrcode) {
		    return qrCode == null ? 
		    		newQrcode == null : qrCode.equals(newQrcode);
		  }

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", establishment=" + establishment + ", qrCode=" + qrCode + ", name=" + name
				+ ", description=" + description + "]";
	}
    
    
}
