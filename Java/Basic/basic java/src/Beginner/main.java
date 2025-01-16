package Beginner;

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
        
        mobilSaya.tampilkanInfo(); // Output: Merek: Toyota, Model: Camry, Tahun: 2020
        mobilKamu.tampilkanInfo(); // Output: Merek: Honda, Model: Civic, Tahun: 2019
    }
}