package com.coffeemenu;

public class MultiplicationTable {
    public static void main(String[] args) {
        int rows = 10; // Number of rows
        int cols = 10; // Number of columns

        // Create a 2D array to store the multiplication table
        int[][] multiplicationTable = new int[rows][cols];

        // Fill the 2D array with multiplication results using nested for loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1); // Storing multiplication result
            }
        }

        // Display the multiplication table
        System.out.println("Multiplication Table:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(multiplicationTable[i][j] + "\t"); // Print each element with tab spacing
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
