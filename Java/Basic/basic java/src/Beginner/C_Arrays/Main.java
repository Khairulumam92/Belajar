package Beginner.C_Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayAngka = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

        // Mengambil data array
        System.out.println("===Mengambil data array===");
        System.out.println("Data array index ke-0: " + arrayAngka[0]); // Output: 1
        System.out.println("Data array index ke-5: " + arrayAngka[5]); // Output: 6
        System.out.println("Data array index ke-12: " + arrayAngka[12]); // Output: 13

        // Menampilkan jumlah semua elemen array
        System.out.println("===Jumlah semua elemen array===");
        System.out.println("Jumlah: " + sumArray(arrayAngka)); // Output: 91

        // Menampilkan array yang disalin
        System.out.println("===Array yang disalin===");
        int[] copiedArray = copyArray(arrayAngka);
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: 1 2 3 4 5 6 7 8 9 10 11 12 13

        // Menampilkan nilai maksimum dalam array
        System.out.println("===Nilai maksimum dalam array===");
        System.out.println("Nilai maksimum: " + findMax(arrayAngka)); // Output: 13
        System.out.println("Program selesai");
    }

    // Metode untuk menghitung jumlah semua elemen array
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Metode untuk menyalin array
    public static int[] copyArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    // Metode untuk menemukan nilai maksimum dalam array
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
