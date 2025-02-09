package com.coffeemenu;

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] coffeeOrder = new int[5][2];
        int[] orderCount = new int [4];

        while (true){
            try {
                System.out.println("This is a trial. Maximum order inputs are 5.");
                System.out.print("Enter order (1-4 but 0 to cancel): ");
                for (int i = 0; i < coffeeOrder.length; i++){
                    coffeeOrder [i][0] = Integer.parseInt(input.nextLine());
                    if (coffeeOrder [i][0] == 0){
                        break;
                    }
                    if (coffeeOrder [i][0] < 1 || coffeeOrder [i][0] > 4) {
                        System.out.println("Invalid choice. Please try again.");
                        continue;
                    }

                    System.out.print("Enter quantity: ");
                    coffeeOrder [i] [1] = Integer.parseInt(input.nextLine()); // This is better to avoid discarding next line character
                    if (coffeeOrder [i] [1] < 1) {
                        System.out.println("Quantity must be at least 1. Please try again.");
                        continue;
                    }

                    orderCount[coffeeOrder [i][0] - 1] += coffeeOrder [i][1];

                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}
