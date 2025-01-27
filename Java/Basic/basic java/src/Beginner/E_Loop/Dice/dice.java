package Beginner.E_Loop;

import java.util.Random;
import java.util.Scanner;

public class dice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetValue = 0;
        int maxWins = 2;
        int maxLosses = 4;

        int wins = 0;
        int losses = 0;
        
        System.out.println("Permainan Dadu Dimulai!");
        System.out.println("Target nilai: " + targetValue);
        System.out.println("Maksimum kemenangan: " + maxWins);
        System.out.println("Maksimum kekalahan: " + maxLosses);

        while (wins < maxWins && losses < maxLosses) {
            int diceRoll = random.nextInt(6) + 1;
            System.out.println("Hasil lemparan dadu: " + diceRoll);

            if (diceRoll >= targetValue) {
                wins++;
                System.out.println("Anda menang!");
            } else {
                losses++;
                System.out.println("Anda kalah!");
            }

            System.out.println("Kemenangan: " + wins + ", Kekalahan: " + losses);
            System.out.println();
        }

        System.out.println("Permainan selesai!");
        System.out.println("Total Kemenangan: " + wins);
        System.out.println("Total Kekalahan: " + losses);

        if (wins == maxWins) {
            System.out.println("Selamat! Anda mencapai batas kemenangan.");
        } else {
            System.out.println("Sayang sekali! Anda mencapai batas kekalahan.");
        }

        scanner.close();
    }
}
