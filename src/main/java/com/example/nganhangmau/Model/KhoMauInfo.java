package com.example.nganhangmau.Model;

public class KhoMauInfo {
    private int id;
    private String nhommau;
    private int donvi;

    public KhoMauInfo(int id, String nhommau, int donvi) {
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
