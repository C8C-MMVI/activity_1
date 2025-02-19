package com.coffeemenu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayListTry {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(100);
        num.add(200);

        for (int i = 0; i < num.size(); i++){
            System.out.println(num.get(i));
        }

        Scanner input = new Scanner(System.in);

        LinkedList<String> names = new LinkedList<>();
        names.add("Cooper");
        names.add("Pete");
        names.add("Lenny");
        System.out.println("List of names:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.print("What name should you remove? " +
                "Answer from 0 to 2: ");
        int removeName = input.nextInt();
        names.remove(removeName);
        System.out.println("Updated list:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
