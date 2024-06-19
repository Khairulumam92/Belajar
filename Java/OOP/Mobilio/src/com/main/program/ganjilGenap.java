package com.main.program;

import java.util.Scanner;

public class ganjilGenap {
    public int bilangan;
    Scanner scan = new Scanner(System.in);

    //method
    public void Nilai() throws RuntimeException {
        System.out.print("Masukkan Angka : ");
        int bilangan = scan.nextInt();
        try{
            if (bilangan % 2 == 0) {
            System.out.print(bilangan + " adalah bilangan genap");
        } else {
            System.out.print(bilangan + " adalah bilangan ganjil");
        }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    /*public void hitung(){
            if (bilangan % 2 == 0) {
                System.out.println(bilangan + " adalah bilangan genap");
            } else {
                System.out.println(bilangan + " adalah bilangan ganjil");
            }
        }
     */


}
