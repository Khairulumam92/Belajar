package Beginner.A_Mobil;

public class Motor {
    String merek;
    String model;
    String roda;
    int tahun;

    void tampilkanInfo() {
        System.out.println("Merek: " + merek + ", Model: " + model + ", Roda: " + roda + ", Tahun: " + tahun);
    }

    void tampilkanNama(){
        System.out.println("Nama Motor: " + merek + " " + model);
    }

    void start(){
        System.out.println("Motor dinyalakan");
    }

    void stop(){
        System.out.println("Motor dimatikan");
    }
    
}
