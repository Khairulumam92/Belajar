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
        
        mobilSaya.tampilkanInfo(); // Output: Merek: Toyota, Model: Camry, Tahun: 2020
        mobilKamu.tampilkanInfo(); // Output: Merek: Honda, Model: Civic, Tahun: 2019
        mobilDia.tampilkanInfo(); // Output: Merek: Suzuki, Model: Ertiga, Tahun: 2018
    }
}