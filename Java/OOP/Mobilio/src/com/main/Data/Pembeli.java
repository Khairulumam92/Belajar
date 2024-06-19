package com.main.Data;

public class Pembeli {
    public String nama;
    public int umur;
    public String jenisKelamin;
    public String nomerTelp;
    public String alamat;

    //cunstructor
    public Pembeli (String nama, int umur, String jenisKelamin, String nomerTelp, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.nomerTelp = nomerTelp;
        this.alamat = alamat;
    }

    //method
    public void cetakInfoPembeli(){
        System.out.println("Nama pembeli : "+nama);
        System.out.println("Umur pembeli : "+umur+ "tahun");
        System.out.println("Jenis kelamin : "+jenisKelamin);
        System.out.println("Nomer telepon : "+nomerTelp);
        System.out.println("Alamat : "+alamat);
    }
}
