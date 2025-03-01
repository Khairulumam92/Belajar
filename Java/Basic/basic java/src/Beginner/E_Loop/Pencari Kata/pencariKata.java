package Beginner.E_Loop;

import java.util.Scanner;

public class pencariKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Pencari Kata ===");
        System.err.print("Masukkan Kalimat (max 5): ");
        String kalimat = input.nextLine();
        System.out.print("Masukkan Kata yang dicari : ");
        String kata = input.nextLine();

        System.out.println("=== Hasil ===");
        System.out.println("Kata " + kata + " ditemukan sebanyak " + countWord(kalimat, kata) + " kali");
        System.out.println("=== Terimkasih telah menggunakan program ini ===");

    }

    public static int countWord(String kalimat, String kata) {
        int count = 0;
        int index = 0;
        while ((index = kalimat.indexOf(kata, index)) != -1) {
            count++;
            index += kata.length();
        }
        return count;
    }
}