package Beginner.D_Conditions;

public class Condition {
    public static void main(String[] args) {
        int nilaiPertama = 20;
        int nilaiKedua = 10;

        if (nilaiPertama > nilaiKedua) {
            System.out.println("Nilai pertama lebih besar dari nilai kedua");
        }else{
            System.out.println("Nilai pertama lebih kecil dari nilai kedua");
        }

        boolean iya = true, tidak = false;

        if (nilaiPertama > nilaiKedua && iya) {
            System.out.println("Nilai benar");
        }else{
            System.out.println("Nilai salah");
        }

}
