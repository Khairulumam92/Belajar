package Beginner.D_Conditions.Resto;

import java.util.Scanner;

public class Resto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Menu Makanan ===");
        System.out.println("1. Nasi Goreng Rp.5.000 \n2. Mie Goreng Rp. 5.000 \n3. Mie Ayam Rp. 7.000");
        System.out.print("Pilih Menu Makanan(1-3) :");
        int pilMakanan = scanner.nextInt();
        
        int hargaMakanan = 0;
        int hargaMinuman = 0;
        float UangPembayaran = 0;
        float totalHarga = 0;
        
        switch (pilMakanan) {
            case 1:
                hargaMakanan = 5000;
                break;
            case 2:
                hargaMakanan = 5000;
                break;
            case 3:
                hargaMakanan = 7000;
                break;
            default:
            System.out.println("Pilihan tidak valid!");
                break;
        }

        System.out.println("=== Menu Minuman ===");
        System.out.println("1. Air Mineral Rp. 2.000 \n2. Es Jeruk Rp. 4.000 \n3. Es Teh Rp. 3.000");
        System.out.print("Pilih Menu Minuman(1-3) :");
        int pilMinuman = scanner.nextInt();

        switch (pilMinuman) {
            case 1:
                hargaMinuman = 2000;
                break;
            case 2:
                hargaMinuman = 4000;
                break;
            case 3:
                hargaMinuman = 3000;
                break;
            default:
            System.out.println("Pilihan tidak valid!");
                break;
        }

        System.out.print("Masukkan uang pembayaran : Rp. ");
        UangPembayaran = scanner.nextInt();
        
        System.out.print("Apakah anda adalah member(y/n)? :");
        String isMember = scanner.next();

        System.out.println("=== Struk Pembayaran ===");

        if (isMember.equalsIgnoreCase("y")) {
            totalHarga = (hargaMakanan + hargaMinuman) - (hargaMakanan + hargaMinuman) * 10 / 100;
            System.out.println("Total yang harus dibayar: " + totalHarga );
            System.out.println("Kembalian : Rp. " + (UangPembayaran - totalHarga));
        } else {
            totalHarga = hargaMakanan + hargaMinuman;
            System.out.println("Total yang harus dibayar: Rp. " + totalHarga );
            System.out.println("Kembalian : Rp. " + (UangPembayaran - totalHarga));
        }
        
        scanner.close();

    }
}
