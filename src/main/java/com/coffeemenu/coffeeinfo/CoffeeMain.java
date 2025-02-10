package com.coffeemenu.coffeeinfo;


public class CoffeeMain {
    public static void main(String[] args) {
        CoffeeType coffee = new CoffeeType();
        coffee.name = "Latte";
        coffee.type = "Arabica";

        System.out.println(coffee.name + " " + coffee.type);

        CoffeeType coffee2 = new CoffeeType();
        coffee2.name = "Espresso";
        coffee2.type = "Robusta";
    }
}
