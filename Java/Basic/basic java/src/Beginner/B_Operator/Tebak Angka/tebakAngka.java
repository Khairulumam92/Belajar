package Tebak;

import java.util.Scanner;

public class tebakAngka {
    public static void main(String[] args) {
        int nilaiTebakan;
        int nilaiBenar = 7;
        boolean statusTebakan;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Masukkan angka tebakan anda : ");
        nilaiTebakan = inputUser.nextInt();

        System.out.println("Nilai tebakan anda adalah : " + nilaiTebakan);

        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda : " + statusTebakan);

        System.out.println("masukkan nilai diantara 4 sampai 9 : ");
        nilaiTebakan = inputUser.nextInt();

        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);

        System.out.println("Tebakan anda : " + statusTebakan);
        // operasi
        inputUser.close();

    }
}
