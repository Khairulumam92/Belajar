package Beginner.B_Operator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Kalkulator sederhana ===");
        System.out.println("Menu operasi:");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");
        System.out.print("Masukkan Pilihan : ");
        int choice = scan.nextInt();

        System.out.println("Masukkan angka pertama:");
        int A = scan.nextInt();
        System.out.println("Masukkan angka kedua:");
        int B = scan.nextInt();

        switch (choice) {
            case 1:
                tambah(A, B);
                break;
            case 2:
                System.out.println("Hasil: " + kurang(A, B));
                break;
            case 3:
                System.out.println("Hasil: " + kali(A, B));
                break;
            case 4:
                System.out.println("Hasil: " + bagi(A, B));
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }

    // Metode untuk operasi penjumlahan
    void tambah(int A, int B) {
        System.out.println("Hasil: " + tambah(A, B));
    }

    // Metode untuk operasi pengurangan
    public static int kurang(int A, int B) {
        return A - B;
    }

    // Metode untuk operasi perkalian
    public static int kali(int A, int B) {
        return A * B;
    }

    // Metode untuk operasi pembagian
    public static int bagi(int A, int B) {
        if (B == 0) {
            System.out.println("Error: Pembagian dengan nol");
            return 0;
        }
        return A / B;
    }
}