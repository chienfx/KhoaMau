package com.example.nganhangmau.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "khomau")
public class khoMau implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "nhommau", length = 10, nullable = false)
    private String nhommau;

    @Column(name = "donvi", length = 10)
    private int donvi;

    public khoMau(){
        super();
    }

    public khoMau(int id, String nhommau, int donvi) {
        this.id = id;
        this.nhommau = nhommau;
        this.donvi = donvi;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNhommau() {
        return nhommau;
    }

    public void setNhommau(String nhommau) {
        this.nhommau = nhommau;
    }

    public int getDonvi() {
        return donvi;
    }

    public void setDonvi(int donvi) {
        this.donvi = donvi;
    }


}
