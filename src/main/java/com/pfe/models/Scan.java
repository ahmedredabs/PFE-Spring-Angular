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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "qrCode_id")
    private QRCode qrCode;

    public Scan(){

    }

    public Scan(Citizen citizen, QRCode qrCode){
        this.citizen = citizen;
        this.qrCode = qrCode;
    }

}
