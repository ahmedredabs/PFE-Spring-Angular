package com.pfe.models;

import javax.persistence.*;

@Entity
@Table(name = "scans")
public class Scan {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne
    @JoinColumn(name = "citizen_id")
    private Citizen citizen;

    @ManyToOne
    @JoinColumn(name = "qrCode_id")
    private Qrcode qrCode;

    @Override
	public String toString() {
		return "Scan [id=" + id + ", citizen=" + citizen + ", qrCode=" + qrCode + "]";
	}

	public Citizen getCitizen() {
		return citizen;
	}

	public Qrcode getQrCode() {
		return qrCode;
	}

	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}

	public void setQrCode(Qrcode qrCode) {
		this.qrCode = qrCode;
	}

	public Scan(){

    }

    public Scan(Citizen citizen, Qrcode qrCode){
        this.citizen = citizen;
        this.qrCode = qrCode;
    }

}
