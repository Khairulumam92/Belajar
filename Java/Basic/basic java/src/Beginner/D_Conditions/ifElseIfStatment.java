package Beginner.D_Conditions;

import java.util.Scanner;

public class ifElseIfStatment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka yang ingin anda pilih(1-3): ");
        int nilaiPertama = input.nextInt();

        /*
         * dengan if else statement kita bisa membuat opsi juga,
         * atau jika lebih sederhana bisa menggunakan switch case
         */

        if (nilaiPertama == 1) {
            System.out.println("Aksi 1");
        } else if (nilaiPertama == 2) {
            System.out.println("Aksi 2");
        } else if (nilaiPertama == 3) {
            System.out.println("Aksi 3");
        } else {
            System.out.println("Nilai default");
        }
        input.close();
        System.out.println("=== Program Selesai ===");
        System.out.println("=== Terima Kasih ===");
    }
}
