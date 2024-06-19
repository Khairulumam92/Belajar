package com.main.Data;

public class Barang {
    //property/atrribute
    public String namaBarang;
    public int hargaBarang;
    public int stokBarang;

    //method/behavior

    //method cunstroctor
    public Barang(String namaBarang,int hargaBarang, int stokBarang){
        //System.out.println("Object berhasil dibuat");
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.stokBarang= stokBarang;

    }

    //method wajib
    public void tambahStok(int jmlTambah){
        stokBarang += jmlTambah; //atau bisa juga stokBarang = StokBarang + jmlTambah;
        System.out.println("Stok barang berhasil ditambah menjadi : " +stokBarang + "\n");

    }

    public void kurangiStok(int jmlKurang){
        stokBarang -= jmlKurang;
        System.out.println("Stok berhasil dikurangi : " +stokBarang+ "\n"); //menampilkan stok setelah dikurangi
    }

    public boolean cekStok(){
        if (stokBarang > 0 ){
            return true;
        } else {
            return false;
        }
    }

    public void cetakInfoBarang(){
        System.out.println("Nama barang " + namaBarang);
        System.out.println("Harga barang : Rp. " +hargaBarang);
        System.out.println( "Stok Barang : " +stokBarang + "pcs\n" );
    }


    //method setter
    public void setNamaBarang(String namaBarang){
        this.namaBarang = namaBarang;
    }

    public void setHargaBarang(int hargaBarang){
        this.hargaBarang = hargaBarang;
    }

    public void setStokBarang(int stokBarang){
        this.stokBarang = stokBarang;
    }

    //method getter
    public String getNamaBarang(){
        return this.namaBarang;
    }

    public int getHargaBarang(){
        return this.hargaBarang;
    }

    public int getStokBaranget(){
        return this.stokBarang;
    }


}
