package com.coffeemenu.coffeeinfo;

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
    String[] flavorNotes;
    String brewMethod;


    // Constructor
    public Coffee(String name, String type, String size, double price, String roastLevel, String origin, boolean isDecaf, int stock, String [] flavorNotes, String brewMethod) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
        this.roastLevel = roastLevel;
        this.origin = origin;
        this.isDecaf = isDecaf;
        this.stock = stock;
        this.flavorNotes= flavorNotes;
        this.brewMethod = brewMethod;
    }


    // Methods

    /**
     * Method for pricing
     * @param size
     * @return pricing
     */
    public double calculatePrice(String size) {
        switch (size) {
            case "Small":
                return price + 0.00;
            case "Medium":
                return price + 25.00;
            case "Large":
                return price + 50.00;
            default:
                return price;
        }
    }


    public boolean checkStock() {
        return stock > 0;
    }


//    public void addFlavor(String note) {
//
//    }


    public void updateStock(int quantity) {
        this.stock += quantity;
    }


    public String describe() {
        return String.format("A %s roast coffee with %s notes from %s. Brewed using %s method.",
                roastLevel, flavorNotes, origin, brewMethod);
    }


    public void setDecaf(boolean isDecaf) {
        this.isDecaf = isDecaf;
    }


    public void changeRoastLevel(String newRoastLevel) {
        this.roastLevel = newRoastLevel;
    }


    public void discount(double percentage) {
        this.price -= this.price * (percentage / 100);
    }


    // Display the coffee details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Price: ₱" + price);
        System.out.println("Roast Level: " + roastLevel);
        System.out.println("Origin: " + origin);
        System.out.println("Decaf: " + isDecaf);
        System.out.println("Stock: " + stock);
        System.out.println("Flavor Notes: " + String.join(", ", flavorNotes));
        System.out.println("Brew Method: " + brewMethod);
    }
}

