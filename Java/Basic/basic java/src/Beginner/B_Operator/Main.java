package Beginner.B_Operator;

public class Main {
    public static void main(String[] args) {
        // Operator Aritmatika

        System.out.println("===operasi penambahan===");
        Operator penjumlahan = new Operator();
        penjumlahan.a = 10;
        penjumlahan.b = 5;
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

    }
}
