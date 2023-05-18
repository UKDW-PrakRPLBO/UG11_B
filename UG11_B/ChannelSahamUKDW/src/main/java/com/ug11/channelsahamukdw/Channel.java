package com.ug11.channelsahamukdw;

public class Channel {
    private String namaDepan;
    private String namaBelakang;
    private String email;
    private int totalTag;

    //TODO 1: Buat getter untuk atribut diatas

    public void printInfo(){
        System.out.println("Nama Depan: "+getNamaDepan());
        System.out.println("Nama Belakang: "+getNamaBelakang());
        System.out.println("Email: "+getEmail());
        System.out.println("Total Tag: "+getTotalTag());
    }

    //TODO 2: Lengkapi Class Channel sesuai dengan tabel di soal

}
