package Beginner.D_Conditions;

import java.util.Scanner;

public class cekNilai {
    public static void main(String[] args) {
        System.out.println("=== Program penghiitung nilai ===");
        int nilai = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai anda: ");
        nilai = input.nextInt();

        if (nilai >= 90) {
            System.out.println("Nilai anda A");
        } else if (nilai >= 80) {
            System.out.println("Nilai anda B");
        } else if (nilai >= 70) {
            System.out.println("Nilai anda C");
        } else if (nilai >= 60) {
            System.out.println("Nilai anda D");
        } else {
            System.out.println("Nilai anda E");
        }

        System.out.println("=== Program Selesai ===");
        System.out.println("Terima Kasih");

    }
}
