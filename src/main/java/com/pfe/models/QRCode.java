package com.pfe.models;

import javax.persistence.*;

@Entity
@Table(name = "qrcodes")
public class QRCode {

    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "physician_id")
    private Physician physician;

    public QRCode(){

    }

    // TODO Builder Pattern ????

    public QRCode(Company companyId, String placeName, String placeDescription){
        this.company = companyId;
    }

    public QRCode(Physician physician){
        this.physician = physician;
    }

    public Company getCompanyId() {
        return company;
    }

    public Physician getPhysician() {
        return physician;
    }

    public long getId() {
        return id;
    }

    public void setCompanyId(Company companyId) {
        this.company = companyId;
    }

    public void setPhysician(Physician physicianId) {
        this.physician = physicianId;
    }
}
