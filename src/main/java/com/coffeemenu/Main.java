package com.coffeemenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        System.out.println("Hello " + firstName + " " + lastName);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        String operator = input.next();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int result;
        switch (operator) {
            case "+" -> {
                result = num1 + num2;
                System.out.println("The result is " + result);
            }
            case "-" -> {
                result = num1 - num2;
                System.out.println("The result is " + result);
            }
            case "*" -> {
                result = num1 * num2;
                System.out.println("The result is " + result);
            }
            case "/" -> {
                result = num1 / num2;
                System.out.println("The result is " + result);
            }
            default -> {
                System.out.println("Incorrect operator. Try again");
                input.nextLine();
            }
        }

        System.out.print("Enter a distance in km: ");
        double km = input.nextInt();
        System.out.println(km + " km is " + (km / 1.609) + " mi");

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Looping through numbers from 1 to " + num + ":");
        for (int i = 1; i <= num; i++){
            System.out.println(i);
        }

        System.out.println("Enter a word: ");
        String word = input.nextLine();
        for (int i = word.length() - 1; i >= 0; i--){
            System.out.print(i);
        }
    }
}
