package Beginner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Mobil
        Mobil mobilSaya = new Mobil();
        mobilSaya.merek = "Toyota";
        mobilSaya.model = "Camry";
        mobilSaya.roda = "4";
        mobilSaya.tahun = 2020;
        
        mobilSaya.tampilkanInfo(); // Output: Merek: Toyota, Model: Camry, Tahun: 2020
    }
}