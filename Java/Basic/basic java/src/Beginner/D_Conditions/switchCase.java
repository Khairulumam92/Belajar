package Beginner.D_Conditions;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        System.out.println("ini adalah program switch case");
        Scanner input = new Scanner(System.in);

        System.out.println("Siapakah presiden Indonesia ke-3?");
        System.out.println("a. Bj Habibie\nb. Gus Dur\nc. Megawati\nd. Soeharto");
        System.out.println("Soal Pilihan Ganda :");
        String jawaban = input.next();

        switch (jawaban) {
            case "a":
                System.out.println("Jawaban anda benar");
                break;
            case "b":
                System.out.println("Jawaban anda salah");
                break;
            case "c":
                System.out.println("Jawaban anda salah");
                break;
            case "d":
                System.out.println("Jawaban anda salah");
                break;
            default:
                System.out.println("Jawaban tidak ada");
        }
        input.close();

        System.out.println("=== Program Selesai ===");
    }
}
