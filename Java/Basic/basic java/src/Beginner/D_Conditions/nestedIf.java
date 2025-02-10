package Beginner.D_Conditions;

public class nestedIf {
    public static void main(String[] args) {
        System.out.println("=== Contoh nested if ===");

        // if (condition) {
        // if (condition) {
        // statement aksi;
        // } else {
        // statement default 2;
        // }
        // } else {
        // statement default 1;

        // }

        int a = 10, b = 20;

        if (a == 10) {
            if (b == 20) {
                System.out.println("ini adalah a = 10 dan b = 20(kedua kondisi terpenuhi)");
            } else {
                System.out.println("ini adalah a = 10 dan b bukan 20");
            }
        } else {
            System.out.println("ini adalah a dan b salah atau salah satu saja yang salah");
        }

        System.out.println("=== Akhir dari program ===");
    }
}
