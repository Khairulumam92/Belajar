public class Main {
    public static void main(String[] args) {

        // Deklarasi dan Instansiasi Objek
        Mobil mobilSaya = new Mobil("Toyota", "Hitam", 2023);

        // Menggunakan Objek
        System.out.println("Merek mobil: " + mobilSaya.merek);
        System.out.println("Warna mobil: " + mobilSaya.warna);
        System.out.println("Tahun mobil: " + mobilSaya.tahun);
    }
}