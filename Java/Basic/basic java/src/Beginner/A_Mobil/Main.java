package Beginner.A_Mobil;

import Beginner.Mobil;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Mobil
        Mobil mobilSaya = new Mobil();
        mobilSaya.merek = "Toyota";
        mobilSaya.model = "Camry";
        mobilSaya.roda = "4";
        mobilSaya.tahun = 2020;

        Mobil mobilKamu = new Mobil();
        mobilKamu.merek = "Honda";
        mobilKamu.model = "Civic";
        mobilKamu.roda = "4";
        mobilKamu.tahun = 2019;

        Mobil mobilDia = new Mobil();
        mobilDia.merek = "Suzuki";
        mobilDia.model = "Ertiga";
        mobilDia.roda = "4";
        mobilDia.tahun = 2018;

        //objek Motor
        Motor motorSaya = new Motor();
        motorSaya.merek = "Yamaha";
        motorSaya.model = "NMax";
        motorSaya.roda = "2";

        Motor motorKamu = new Motor();
        motorKamu.merek = "Honda";
        motorKamu.model = "CBR1000RR";
        motorKamu.roda = "2";

        Motor motorDia = new Motor();
        motorDia.merek = "Kawasaki";
        motorDia.model = "Ninja";
        motorDia.roda = "2";

        System.out.println("===Method tampilkanInfo===");
        //panggil method tampilkanInfo()
        mobilSaya.tampilkanInfo(); // Output: Merek: Toyota, Model: Camry, Tahun: 2020
        mobilKamu.tampilkanInfo(); // Output: Merek: Honda, Model: Civic, Tahun: 2019
        mobilDia.tampilkanInfo(); // Output: Merek: Suzuki, Model: Ertiga, Tahun: 2018
        motorKamu.tampilkanInfo(); // Output: Merek: Honda, Model: CBR1000RR, Tahun: 0
        motorSaya.tampilkanInfo(); // Output: Merek: Yamaha, Model: NMax, Tahun: 0

        System.out.println("===Method tampilkanNama===");
        //panggil method tampilkanNama()
        mobilSaya.tampilkanNama(); // Output: Nama Mobil: Toyota Camry
        mobilKamu.tampilkanNama(); // Output: Nama Mobil: Honda Civic
        mobilDia.tampilkanNama(); // Output: Nama Mobil: Suzuki Ertiga
        
        System.out.println("===Method start dan stop===");
        motorDia.tampilkanNama(); // Output: Motor dinyalakan
        motorSaya.start(); // Output: Motor dinyalakan
        motorKamu.stop(); // Output: Motor dimatikan
    
    }
}