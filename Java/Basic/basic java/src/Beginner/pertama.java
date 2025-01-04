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
    }
}
