package com.example.nganhangmau.Entities;

import javax.persistence.*;

@Entity
@Table(name = "khomau")
public class khoMau {

    public khoMau(int id, String nhommau, int donvi) {
        this.id = id;
        this.nhommau = nhommau;
        this.donvi = donvi;
    }

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "nhommau", length = 10, nullable = false)
    private String nhommau;

    @Column(name = "donvi", length = 10)
    private int donvi;

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
