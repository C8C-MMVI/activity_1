package com.coffeemenu;

import java.util.ArrayList;
import java.util.Arrays;

public class Coffee {
    // Attributes
    String name;
    String type;
    String size;
    double price;
    String roastLevel;
    String origin;
    boolean isDecaf;
    int stock;
    public ArrayList<String> flavorNotes;
    String brewMethod;


    /**
     * Object constructor
     * @param name          The available names
     * @param type          Types of coffee (espresso, latte)
     * @param size          Available sizes (small / medium / large)
     * @param price         Shows the price
     * @param roastLevel    Roast level of the coffee beans (light, medium, dark)
     * @param origin        Types of coffee beans (Arabica, Robusta)
     * @param isDecaf       Shows the option for a decaffeinated beverage
     * @param stock         Checks the stock of different coffees
     * @param flavorNotes   Array of flavor notes of coffee
     * @param brewMethod    Method used to brew the coffee (French press, drip)
     */
    public Coffee(String name, String type, String size, double price,
                  String roastLevel, String origin, boolean isDecaf, int stock,
                  String [] flavorNotes, String brewMethod) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = 75; // default price (even for small coffee)
        this.roastLevel = roastLevel;
        this.origin = origin;
        this.isDecaf = isDecaf;
        this.stock = stock;
        this.flavorNotes= new ArrayList<>(Arrays.asList(flavorNotes));
        this.brewMethod = brewMethod;
    }


    // Methods

    /**
     * Method for pricing
     * @param size The available coffee sizes (small, medium, large)
     * @return pricing
     */
    public void calculatePrice(String size) {
        switch (size.toLowerCase()) {
            case "small":
                this.price += 0.00;
                break;
            case "medium":
                this.price += 25.00;
                break;
            case "large":
                this.price += 50.00;
                break;
            default:
                System.out.println("Invalid size.");
        }
        System.out.println("Price of " + this.name + " (" + this.size + "): PHP " + this.price);
    }

    /**
     * void method to check stock
     */
    public void checkStock() {
        System.out.println("Stock for " + this.name + ": " + (this.stock > 0 ? "Available" : "Out of stock"));
    }

    /**
     * void method to allow adding flavor
     * @param note ArrayList form to add flavor notes
     */
    public void addFlavor(String note) {
        this.flavorNotes.add(note);
        System.out.println("Flavor added to your coffee: " + note);
    }


    public void updateStock(int quantity) {
        this.stock += quantity;
        System.out.println("Stock updated for " + this.name + ": " + this.stock);
    }

    // method to describe the coffee, including the roast level and flavor notes
    public String describe() {
        return String.format("A %s roast coffee with %s notes from %s. Brewed using %s method.",
                roastLevel, flavorNotes, origin, brewMethod);
    }


    public void setDecaf(boolean isDecaf) {
        this.isDecaf = isDecaf;
        System.out.println(this.name + " is " + (this.isDecaf ? "decaffeinated" : "in its regular, caffeinated form"));
    }


    public void changeRoastLevel(String newRoastLevel) {
        this.roastLevel = newRoastLevel;
        System.out.println(this.name + ": roast level is changed to " + this.roastLevel);
    }


    public void discount(int percentage) {
        double discountAmount = (this.price * percentage) / 100;
        this.price -= discountAmount;
        System.out.println("Discount applied to your order! Current price of your order: "
                + this.name + ": PHP " + this.price);
    }
}


