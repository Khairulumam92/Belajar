package com.main.Data;

public class Penjual {

    //Property
    public String nama;
    public int umur;
    public String jenisKelamin;
    public int lamaKerja;

    public Penjual(String nama, int umur, String jenisKelamin, int lamaKerja){
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.lamaKerja = lamaKerja;
    }

    //methode
    public void cetakInfoPenjual(){
        System.out.println("Nama penjual : " +nama);
        System.out.println("Umur penjual : " +umur);
        System.out.println("Jenis Kelamin : " +jenisKelamin);
        System.out.println("Lama kerja  : " +lamaKerja+ "Tahun.\n");
    }


}
