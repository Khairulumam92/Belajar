package Beginner.D_Conditions;

import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        System.out.println("ini adalah program ternary operator");
        Scanner input = new Scanner(System.in);
        int inputAngka, X;

        System.out.print("Masukkan angka yang ingin di cek : ");
        inputAngka = input.nextInt();

        // menggunakan ternary operator
        X = (inputAngka == 10) ? (inputAngka * inputAngka) : (inputAngka / 2);

        // jika menggunakan if else
        // if (inputAngka == 10) {
        // X = (inputAngka * inputAngka);
        // } else {
        // X = (inputAngka / 2);
        // }

        System.out.println("Hasilnya adalah : " + X);

    }
}
