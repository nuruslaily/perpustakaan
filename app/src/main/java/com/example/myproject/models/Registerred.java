package com.example.myproject.models;

public class Registerred {

    private String nama;
    private String jeniskelamin;
    private String alamat;
    private String notelp;
    private String email;
    private String username;
    private String pekerjaan;

    public Registerred(){

    }

    public Registerred(String nama, String jeniskelamin, String alamat, String notelp, String email, String username, String pekerjaan) {
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.alamat = alamat;
        this.notelp = notelp;
        this.email = email;
        this.username = username;
        this.pekerjaan = pekerjaan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
}
