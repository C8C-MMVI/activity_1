package com.coffeemenu;

import java.util.Scanner;

public class SeatingChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a 3x3 seating chart
        String[][] chart = new String[3][3];

        // Fill the chart with user input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter name for seat (" + i + ", " + j + "): ");
                chart[i][j] = scanner.nextLine();
            }
        }

        // Print the seating chart
        System.out.println("\nSeating Chart:");
        for (int i = 0; i < chart.length; i++) {
            for (int j = 0; j < chart[i].length; j++) {
                System.out.print(chart[i][j] + "\t\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
