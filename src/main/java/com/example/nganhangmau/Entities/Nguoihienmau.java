package com.example.nganhangmau.Entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name = "nguoihienmau")
public class Nguoihienmau implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    @NotEmpty(message = "nhap ho ten")
    @Column(name = "hoten", nullable = false)
    private String hoTen;
    @NotEmpty(message = "nhap so dien thoai")
    @Column(name = "sdt", nullable = false)
    private int sdt;
    @NotEmpty(message = "nhap email")
    @Column(name = "email", nullable = false)
    private String email;
    @NotEmpty(message = "nhap ten facebook")
    @Column(name = "fb", nullable = false)
    private String fb;
    @NotEmpty(message = "nhap gioi tinh")
    @Column(name = "gioitinh", nullable = false)
    private String gioiTinh;
    @NotEmpty(message = "nhap tuoi")
    @Column(name = "tuoi", nullable = false)
    private int tuoi;
    @NotEmpty(message = "nhap nhommau")
    @Column(name = "nhommau",nullable = false)
    private String nhomMau;
    @NotEmpty(message = "nhap dia chi")
    @Column(name = "diachi", nullable = false)
    private String diaChi;

  /*  @Column(name = "ngayHen", nullable = false)
    private int ngayHen;*/

    public Nguoihienmau(){
        super();
    }

    public Nguoihienmau(String hoTen, int sdt, String email, String fb, String gioiTinh, int tuoi, String nhomMau, String diaChi) {
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
        this.fb = fb;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.nhomMau = nhomMau;
        this.diaChi = diaChi;
       /* this.ngayHen = ngayHen;*/
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFb() {
        return fb;
    }

    public void setFb(String fb) {
        this.fb = fb;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNhomMau() {
        return nhomMau;
    }

    public void setNhomMau(String nhomMau) {
        this.nhomMau = nhomMau;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

   /* public int getNgayHen() {
        return ngayHen;
    }

    public void setNgayHen(int ngayHen) {
        this.ngayHen = ngayHen;
    }*/
}
