package Beginner;

import java.util.Scanner;

public class pertama {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Nilai a: " + a);

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();

        System.out.println("Nilai b: " + b);
        input.close();

        int c = a + b;

        System.out.println("Hasil a + b: " + c);

        if (i > 10) {
            System.out.println("Hasil lebih dari 10");
        } else {
            System.out.println("Hasil kurang dari 10");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }

    }
}
