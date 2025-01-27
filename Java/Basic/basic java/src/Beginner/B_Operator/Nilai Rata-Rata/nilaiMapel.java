package Beginner.B_Operator.Nilai_Rata_Rata;

import java.util.Scanner;

public class nilaiMapel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float Matematika = 0, Fisika = 0, Biologi = 0;

        System.out.println("=== Penghitung Nilai Rata-Rata ===");
        System.out.print("Masukkan nilai Matematika : ");
        Matematika = scanner.nextFloat();
        System.out.print("Masukkan nilai fisika : ");
        Fisika = scanner.nextFloat();
        System.out.print("Masukkan nilai Biologi : ");
        Biologi = scanner.nextFloat();

        float rataRata = (Matematika + Fisika  + Biologi) / 3;
        float bobotMatematika = 0.4f, bobotFisika = 0.3f, bobotBiologi = 0.3f;

        float nilaiAkhir = (Matematika * bobotMatematika) + (Fisika * bobotFisika) + (Biologi * bobotBiologi);

        System.out.println("\n=== Hasil ===");
        System.out.println("Nilai rata-rata adalah : " + rataRata);
        System.out.println("Nilai akhir adalah : " + nilaiAkhir);

    }
}
