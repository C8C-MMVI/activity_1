package com.coffeemenu;

public class Car {
    // Fields (state)
    String color;
    String model;
    int speed;

    // Methods (behavior)
    void accelerate() {
        speed += 10;
    }

    void brake() {
        speed -= 10;
    }

    void honk() {
        System.out.println("Beep beep!");
    }
}
