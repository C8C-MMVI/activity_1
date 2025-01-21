
package com.ivanandre;

import java.util.Scanner;

public class CoffeeOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int orderNumber;
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
                orderNumber = input.nextInt();
                if (orderNumber > 0 && orderNumber <= 4) {
                    System.out.print("Enter quantity: ");
                    int quantity = input.nextInt();
                    System.out.println();
                } else if (orderNumber == 0){
                    System.out.println("Thank you for ordering. Here's your receipt: ");
                    // printReceipt();
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again\n");
                }
            } catch (Exception e) {
                System.out.println("Invalid choice. Please try again\n");
                input.nextLine();
            }
        }

    }

    /**
     * Method for printing receipt
     * @param quantities
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