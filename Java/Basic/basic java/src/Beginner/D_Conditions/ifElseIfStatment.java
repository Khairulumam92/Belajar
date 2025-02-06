package Beginner.D_Conditions;

public class ifElseIfStatment {
    public static void main(String[] args) {
        int nilaiPertama = 20, nilaiKedua = 10;

        if (nilaiPertama == 10) {
            System.out.println("Aksi 1");
        } else if (nilaiPertama < nilaiKedua) {
            System.out.println("Aksi 2");
        } else if (nilaiKedua == nilaiPertama) {
            System.out.println("Aksi 3");
        } else {
            System.out.println("Nilai default");
        }
    }
}
