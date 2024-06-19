package com;

import com.main.Data.Pembeli;
import com.main.Mobil;
import com.main.Murid;
import com.main.menu.Menu;
import com.main.Data.*; //mengimport semua file dalam folder Data
import com.main.program.ganjilGenap;


public class Utama {
    public static void main(String[] args) {
        /*
        //inisiasi class Mobil menjadi object mobil
        Mobil mobil = new Mobil();
        mobil.start();
        mobil.mati();

        //inisiasi
        Murid Murid1 = new Murid();//inisiasi class Murid menjadi Murid
        Murid1.makan();
        Murid1.lapar();//memanggil method lapar pada class Murid

        //inisiasi
        Menu menuUtama = new Menu();
        menuUtama.mainMenu();
        menuUtama.pilihan();
        */

        //instansiasi object
        Barang barang1 = new Barang("Shampoo", 7000, 100);

        //akses property dalam object
        //barang1.namaBarang = "sabun";
        //barang1.hargaBarang = 10000;
        //barang1.stokBarang = 10;

        //memanggil method dalam object
        barang1.cetakInfoBarang();

        barang1.setNamaBarang();

        //Barang barang2 = new Barang();
        //barang2.namaBarang = "odol";
        //barang2.hargaBarang = 7000;
        //barang2.stokBarang = 100;
        //barang2.cetakInfoBarang();


        //System.out.println(barang1.namaBarang + barang1.hargaBarang + barang1.stokBarang);

        //barang1.tambahStok(5); //memanggil method tambahstok pada class Barang
        //barang1.kurangiStok(3);
        //System.out.println("Apakah stok masih ada? " +barang1.cekStok());

        //instansiasi class Penjual menjadi penjual1
        Penjual penjual1 = new Penjual("Udin", 17, "laki-laki", 18);
        /*penjual1.nama = "udin";
        penjual1.umur = 18;
        penjual1.jenisKelamin = "laki-laki";
        penjual1.lamaKerja = 17; */
        //memanggil method object pembeli1
        penjual1.cetakInfoPenjual();

        //instansiasi class Pembeli
        Pembeli pembeli1 = new Pembeli("umam", 17, "laki-laki", "0831191019", "jl. notojoyo");
        /*pembeli1.nama = "warda";
        pembeli1.umur = 17;
        pembeli1.jenisKelamin = "perempuan";
        pembeli1.nomerTelp = "083119903001";
        pembeli1.alamat = "jl. sukoharjo"; */
        //memanggil method object pembeli1
        pembeli1.cetakInfoPembeli();















    }
}

