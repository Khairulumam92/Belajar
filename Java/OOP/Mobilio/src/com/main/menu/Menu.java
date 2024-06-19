package com.main.menu;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    public void mainMenu(){
        System.out.println("Silahkan pilih dari salah satu menu Berikut");
        System.out.println("1. Mencari nama");
        System.out.println("2. membaca panjang kalimat");
    }

    public void pilihan(){
        System.out.print("Masukkan nama and :");
        String nama = input.nextLine();

        System.out.println("nama anda adalah " +nama);
    }
}
