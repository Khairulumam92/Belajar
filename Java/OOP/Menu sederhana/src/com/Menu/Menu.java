package com.Menu;

import com.operasi;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);

    public void menuUtama(){
        while (true) { 
            System.out.println("====Menu kalkulator====");
        System.out.println("1. Kalkulator penambahan");
        System.out.println("2. Kalkulator pengurangan");
        System.out.println("3. Kalkulator perkalian");
        System.out.println("4. Kalkulator pembagian");
        System.out.print("Masukkan pilihan anda : ");
        int nilai = scan.nextInt();
        operasi kalOperasi = new operasi();

        switch (nilai) {
            case 1:
                kalOperasi.tambah();
                break;
            case 2:
                kalOperasi.kurangi();
                break;
            case 3:
                kalOperasi.perkalian();
                break;
            case 4:
                kalOperasi.pembagian();
                break;
            default:
                System.out.println("Masukkan pilihan dengan benar!!!");
        }
        }
    }
    

}
