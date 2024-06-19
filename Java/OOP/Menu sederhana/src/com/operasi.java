package com;

import java.util.Scanner;

public class operasi {
    Scanner scan = new Scanner(System.in);

    public void tambah(){
        int z;
        System.out.print("masukkan angka pertama : ");
        int x = scan.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int y = scan.nextInt();
        z = x + y;
        System.out.println("Hasil dari penambahan tersebut adalah : " +z);
    }
    
    public void kurangi(){
        int z;
        System.out.print("masukkan angka pertama : ");
        int x = scan.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int y = scan.nextInt();
        z = x - y;
        System.out.println("Hasil dari pengurangan tersebut adalah : " +z);
    }

    public void perkalian(){
        int z;
        System.out.print("masukkan angka pertama : ");
        int x = scan.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int y = scan.nextInt();
        z = x * y;
        System.out.println("Hasil dari perkalian tersebut adalah : " +z);
    }

    public void pembagian(){
        int z;
        System.out.print("masukkan angka pertama : ");
        int x = scan.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int y = scan.nextInt();
        z = x % y;
        System.out.println("Hasil dari pembagian tersebut adalah : " +z);
    }
}
