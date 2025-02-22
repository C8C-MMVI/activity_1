package com.coffeemenu;

public class CoffeeMain {
    public static void main(String[] args) {
        //first coffee object
        Coffee coffee1 = new Coffee(
                "Espresso", "Arabica", "Medium", 100, "Dark", "Colombia", false, 10,
                new String[]{"Chocolate", "Nutty"}, "French Press"
        );

        //second coffee object
        Coffee coffee2 = new Coffee(
                "Latte", "Robusta", "Large", 100, "Medium", "Brazil", false, 5,
                new String[]{"Caramel", "Creamy"}, "Drip"
        );

        // properties for coffee1 using String.format
        String coffeeOneProperties = String.format("""
                Coffee 1 Details:
                Name: %s
                Type: %s
                Size: %s
                Base Price: %f PHP
                Roast Level: %s
                Origin: %s
                Is Decaf: %b
                Stock: %d
                Flavor Notes: %s
                Brew Method: %s \n
                """, coffee1.name, coffee1.type, coffee1.size, coffee1.price, coffee1.roastLevel,
                coffee1.origin, coffee1.isDecaf, coffee1.stock, coffee1.flavorNotes, coffee1.brewMethod);
        System.out.print(coffeeOneProperties);

        // properties for coffee2 using String.format
        String coffeeTwoProperties = String.format("""
                Coffee 1 Details:
                Name: %s
                Type: %s
                Size: %s
                Base Price: %f PHP
                Roast Level: %s
                Origin: %s
                Is Decaf: %b
                Stock: %d
                Flavor Notes: %s
                Brew Method: %s \n
                """, coffee2.name, coffee2.type, coffee2.size, coffee2.price, coffee2.roastLevel,
                coffee2.origin, coffee2.isDecaf, coffee2.stock, coffee2.flavorNotes, coffee2.brewMethod);
        System.out.print(coffeeTwoProperties);

        // Methods for coffee 1
        System.out.println("=== Coffee 1 ===");
        coffee1.describe();
        coffee1.calculatePrice(coffee1.size);
        coffee1.updateStock(5);
        coffee1.checkStock();
        coffee1.addFlavor("Vanilla");
        coffee1.setDecaf(true);
        coffee1.changeRoastLevel("Light");
        coffee1.discount(15);

        // Methods for coffee 2
        System.out.println("=== Coffee 2 ===");
        coffee2.describe();
        coffee2.calculatePrice(coffee2.size);
        coffee2.updateStock(-2);
        coffee2.checkStock();
        coffee2.addFlavor("Hazelnut");
        coffee2.setDecaf(false);
        coffee2.changeRoastLevel("Dark");
        coffee2.discount(10);

        // updated coffee1 details using String.format
        System.out.println();
        System.out.println("Updated Coffee 1 Details:");
        coffee1.describe();
        String coffeeOneUpdate = String.format("""
                Coffee 1 Details:
                Name: %s
                Type: %s
                Size: %s
                Updated Price: %f PHP
                Roast Level: %s
                Origin: %s
                Is Decaf: %b
                Stock: %d
                Flavor Notes: %s
                Brew Method: %s
                """, coffee1.name, coffee1.type, coffee1.size, coffee1.price, coffee1.roastLevel,
                coffee1.origin, coffee1.isDecaf, coffee1.stock, String.join(", ", coffee1.flavorNotes), coffee1.brewMethod);
        System.out.print(coffeeOneUpdate);

        // updated coffee2 details using String.format
        System.out.println();
        System.out.println("Updated Coffee 2 Details:");
        coffee1.describe();
        String coffeeTwoUpdate = String.format("""
                Coffee 1 Details:
                Name: %s
                Type: %s
                Size: %s
                Updated Price: %f PHP
                Roast Level: %s
                Origin: %s
                Is Decaf: %b
                Stock: %d
                Flavor Notes: %s
                Brew Method: %s
                """, coffee2.name, coffee2.type, coffee2.size, coffee2.price, coffee2.roastLevel,
                coffee2.origin, coffee2.isDecaf, coffee2.stock, String.join(", ", coffee2.flavorNotes), coffee2.brewMethod);
        System.out.print(coffeeTwoUpdate);
    }
}

