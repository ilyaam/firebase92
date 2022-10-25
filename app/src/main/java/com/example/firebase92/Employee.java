package com.example.firebase92;

public class Employee {
    private String nama;
    private String posisi;

    public Employee(String nama, String posisi) {
        this.nama = nama;
        this.posisi = posisi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }
}
