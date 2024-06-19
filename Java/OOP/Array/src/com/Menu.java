package com;
import com.hitung;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);

    public void menu(){
        while (true){
            System.out.println("===Pilih menu kalkulator anda===");
            System.out.println("1. tambah");
            System.out.println("2. perkalian ");
            System.out.println("3. pengurangan ");
            System.out.println("4. pembagian");
            System.out.print("Masukkan Pilihan anda : ");
            int pilih = scan.nextInt();
            hitung hitung1 = new hitung();

            switch(pilih){
                case 1:
                    hitung1.tambah();
                    break;
                case 2:
                    hitung1.perkalian();
                    break;
                case 3:
                    hitung1.pengurangan();
                    break;
                case 4:
                    hitung1.pembagian();
                    break;
                default:
                    System.out.println("Masukkan pilihan dengan benar!");
            }
        }
    }

}
