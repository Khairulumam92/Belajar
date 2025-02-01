package Beginner.C_Arrays.Data

Agen;

public class dataAgen {
    public static void main(String[] args) {
        String agents [5][10] = new String[5][10];
        agents[0][0] = "Neon";
        agents[0][1] = "Gekko";
        agents[0][2] = "Omen";
        agents[0][3] = "Sage";
        agents[0][4] = "Jett";

        System.out.println("Daftar Agen :");
        displayAgents(agents);

        System.out.println("Daftar Agen setelah perubahan:");

        System.out.println("program selesai");

    public static void displayAgents(String[][] agents) {
        for (int i = 0; i < agents.length; i++) {
            for (int j = 0; j < agents[i].length; j++) {
                if (agents[i][j] != null) {
                    System.out.printf("Agent ke-%d: %s\n", j + 1, agents[i][j]);
                }
            }
        }
    }
}}
