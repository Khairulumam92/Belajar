package Beginner.E_Loop;

import java.util.Scanner;

public class hitungAngkaN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angkaN = 0;
        int totalAngka = 0;
        int angkaAwal = 1;

        System.out.print("Masukkan Angka N : ");
        angkaN = input.nextInt();

        System.out.println("=== Hasil ===");
        System.out.println("Jumlah angka dari 1 sampai " + angkaN + " adalah : " + totalAngka);
    }
}
