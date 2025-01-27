package com.coffeemenu;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CoffeeMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        int[] quantities = new int[4]; // to store quantities for each item (including index 0 for finishing order)
        String menu = """
                --- Coffee Menu ---
                1. Espresso - 50.00 PHP
                2. Latte - 70.00 PHP
                3. Cappuccino - 65.00 PHP
                4. Mocha - 80.00
                0. Finish Order""";

        do {
            System.out.println(menu);
            System.out.print("Choose your coffee (1-4), or 0 to finish): ");
            try {
                choice = Integer.parseInt(input.nextLine());

                if (choice >= 1 && choice <= 4) {
                    System.out.print("Enter quantity: ");
                    int quantity = Integer.parseInt(input.nextLine());
                    quantities[choice] += quantity;
                } else if (choice != 0) {
                    System.out.println("Invalid choice, please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice, please try again.");
                choice = -1; // continue the loop
            }
        } while (choice != 0);

        saveReceiptToFile(quantities);
        input.close();
    }

    public static void saveReceiptToFile(int[] quantities) {
        double[] prices = { 50.0, 70.0, 65.0, 80.0};
        String[] names = {"", "Espresso", "Latte", "Cappuccino", "Mocha"};
        double subtotal = 0.0;
        StringBuilder receipt = new StringBuilder();

        receipt.append("\n--- Coffee Order Receipt ---\n");
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > 0) {
                double itemTotal = quantities[i] * prices[i];
                receipt.append(String.format("""
                        %d x %s @ %.2f each = %.2f PHP
                        """, quantities[i], names[i], prices[i], itemTotal));
                subtotal += itemTotal;
            }
        }
        double vat = subtotal * 0.12;
        double grandTotal = subtotal + vat;

        receipt.append(String.format("""
                ---------------------
                Subtotal: %.2f PHP
                VAT (12%%): %.2f PHP
                Grand Total: %.2f PHP
                ---------------------
                """, subtotal, vat, grandTotal));

        try (FileWriter writer = new FileWriter("coffeeReceipt.txt")) {
            writer.write(receipt.toString());
            System.out.println("Receipt saved to coffeeReceipt.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the receipt.");
        }

        System.out.print(receipt); // Also print the receipt to the console
    }
}