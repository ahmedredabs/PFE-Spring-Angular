package com.pfe.models;

import java.time.LocalDate;

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
    
    private LocalDate scanDate;

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
		this.setScanDate(LocalDate.now());
    }

    public Scan(Citizen citizen, Qrcode qrCode){
        this.citizen = citizen;
        this.qrCode = qrCode;
        this.setScanDate(LocalDate.now());
    }

	public LocalDate getScanDate() {
		return scanDate;
	}

	public void setScanDate(LocalDate scanDate) {
		this.scanDate = scanDate;
	}

}
