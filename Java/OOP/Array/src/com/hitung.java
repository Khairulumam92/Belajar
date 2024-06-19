package com;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.IOError;

public class hitung {


    Scanner scan = new Scanner(System.in);

    public void tambah(){
        int z;
        while (true){
            try {
                System.out.println("===Kalkulator tambah===");
                System.out.print("masukkan angka pertama :");
                int y = scan.nextInt();
                System.out.print("Masukkan angka kedua :");
                int x = scan.nextInt();
                z = x + y;

                System.out.println("hasil dari operasi penambahan tersebut adalah " +z);
            } catch (InputMismatchException e){
                System.out.println("Error: Input tidak valid. Harap masukkan angka.");
                scan.nextLine(); // Membersihkan buffer input
            }
        }
    }

    public void perkalian(){
        int z;
        while (true){
            try {
                System.out.println("===Kalkulator perkalian===");
                System.out.print("masukkan angka pertama :");
                int y = scan.nextInt();
                System.out.print("Masukkan angka kedua :");
                int x = scan.nextInt();
                z = x * y;

                System.out.println("hasil dari operasi perkalian tersebut adalah " +z);
            } catch (InputMismatchException e){
                System.out.println("Error: Input tidak valid. Harap masukkan angka.");
                scan.nextLine(); // Membersihkan buffer input
            }
        }
    }

    public void pengurangan(){
        int z;
        while (true){
            try {
                System.out.println("===Kalkulator pengurangan===");
                System.out.print("masukkan angka pertama :");
                int y = scan.nextInt();
                System.out.print("Masukkan angka kedua :");
                int x = scan.nextInt();
                z = y - x;

                System.out.println("hasil dari operasi pengurangan tersebut adalah " +z);
            } catch (InputMismatchException e){
                System.out.println("Error: Input tidak valid. Harap masukkan angka.");
                scan.nextLine(); // Membersihkan buffer input
            }
        }
    }

    public void pembagian(){
        int z;
        while (true){
            try {
                System.out.println("===Kalkulator pembagian===");
                System.out.print("masukkan angka pertama :");
                int y = scan.nextInt();
                System.out.print("Masukkan angka kedua :");
                int x = scan.nextInt();
                z = y % x;

                System.out.println("hasil dari operasi pembagian tersebut adalah " +z);
            } catch (InputMismatchException e){
                System.out.println("Error: Input tidak valid. Harap masukkan angka.");
                scan.nextLine(); // Membersihkan buffer input
            }
        }
    }




}
