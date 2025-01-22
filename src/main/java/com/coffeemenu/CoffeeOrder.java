
package com.coffeemenu;

import java.util.Scanner;

public class CoffeeOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] orderNumber = new int [5];
        int [] quantity = new int [5];
        String menu = """
                --- Coffee Menu ---
                1. Espresso - 50.00 PHP
                2. Latte - 70.00 PHP
                3. Cappuccino - 65.00 PHP
                4. Mocha - 80.00
                0. Finish Order""";
        while (true) {
            System.out.println(menu);
            System.out.print("Choose your coffee (1-4), or 0 to finish): ");
            try {
                for(int i = 0; i < orderNumber.length; i++){
                    orderNumber [i] = input.nextInt();
                    if (orderNumber [i] > 0 && orderNumber[i] <= 4) {
                        System.out.print("Enter quantity: ");
                        for (int j = 0; j < quantity.length; j++){
                            quantity [j] = input.nextInt();
                            // Needs loop break upon entering quantity
                        }
                        System.out.println();
                    } else if (orderNumber [i] == 0){
                        System.out.println("Thank you for ordering. Here's your receipt: ");
                        // printReceipt();
                        break;
                    } else {
                        System.out.println("Invalid choice. Please try again\n");
                    }
                }

            } catch (Exception e) {
                System.out.println("Invalid choice. Please try again\n");
                input.nextLine();
            }
        }

    }

    /**
     * Method for printing receipt
     * @param quantities stores data and prints
     */
    public static void printReceipt (int [] quantities){
        double [] prices = {50.00, 70.00, 65.00, 80.00};
        String [] coffee = {"Espresso", "Latte", "Cappuccino", "Mocha"};
    }

    /**
     * Method for converting method printReceipt to a .txt file
     */
    public static void receiptFile (){
        /*
        try{
            File file = new File("receipt.txt");
        } catch (IOException e){
            System.out.println("An error occurred upon saving file");
        }

         */
    }
}