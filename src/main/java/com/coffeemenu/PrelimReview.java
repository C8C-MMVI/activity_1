package com.coffeemenu;

import java.util.Scanner;

public class PrelimReview {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter no. of rows: ");
            int rows = input.nextInt();
            System.out.print("Enter no. of columns: ");
            int cols = input.nextInt();

            int [][] numbers = new int[rows][cols];

            System.out.println("Enter the values for the 2D array:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Enter value for element [" + i + "][" + j + "]: ");
                    numbers[i][j] = input.nextInt();
                }
            }

            System.out.println("\nSum of each row/s:");
            for (int i = 0; i < rows; i++) {
                int rowSum = 0;
                for (int j = 0; j < cols; j++) {
                    rowSum += numbers[i][j];
                }
                System.out.println("Sum of row " + i + ": " + rowSum);
            }

            // Step 4: Get the sum of all columns
            System.out.println("\nSum of each column/s:");
            for (int j = 0; j < cols; j++) {
                int colSum = 0;
                for (int i = 0; i < rows; i++) {
                    colSum += numbers[i][j];
                }
                System.out.println("Sum of column " + j + ": " + colSum);
            }

            input.close();
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
