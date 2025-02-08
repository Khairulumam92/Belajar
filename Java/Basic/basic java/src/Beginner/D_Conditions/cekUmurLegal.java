package Beginner.D_Conditions;

import java.util.Scanner;

public class cekUmurLegal {
    public static void main(String[] args) {
        System.out.println("=== Contoh penerapan condition ===");
        System.out.println("=== Program Cek umur legal ===");

        int umur = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur anda: ");
        umur = input.nextInt();
        System.out.println("Umur anda adalah: " + umur);

        if (umur >= 17) {
            System.out.println("Anda sudah cukup umur");
        }
        if (umur <= 15) {
            System.out.println("Anda belum cuku umur atau dibawah 17 tahun");
        }
        if (umur >= 60) {
            System.out.println("Anda sudah terlalu tua");
        } else {
            System.out.println("Anda belum cukup umur atau masih muda");
        }
    }
}
