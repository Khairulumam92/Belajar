package Operator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menu

        // Operator Aritmatika
        System.out.println("===operasi penambahan===");
        Operator penjumlahan = new Operator();
        int a = input.nextInt();
        int b = input.nextInt();
        // penjumlahan.a;
        // penjumlahan.b;
        penjumlahan.penjumlahan();

        System.out.println("===operasi pengurangan===");
        Operator pengurangan = new Operator();
        pengurangan.a = 50;
        pengurangan.b = 20;
        pengurangan.pengurangan();

        System.out.println("===Operasi perkalian===");
        Operator perkalian = new Operator();
        perkalian.a = 10;
        perkalian.b = 20;
        perkalian.perkalian();

        System.out.println("Program Selesai");

    }
}
