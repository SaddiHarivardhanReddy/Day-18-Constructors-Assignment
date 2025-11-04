package com.codegnan.oopexamples;

import java.util.Scanner;

public class Menu {
    String name;
    double price;
    String category;

    public Menu(String name, double price, String category) {
        if (name == null) {
            System.out.println("Error: Name cannot be empty");
            return;
        }

        if (price <= 0) {
            System.out.println("Error: Price must be positive");
            return;
        }

        if (category == null) {
            System.out.println("Error: Category cannot be empty");
            return;
        }

        this.name = name;
        this.price = price;
        this.category = category;

        displayDetails();
    }

 
    public void displayDetails() {
        System.out.println("Item: " + name + ", Price: " + price + ", Category: " + category);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double price = sc.nextDouble();
        sc.nextLine(); 
        String category = sc.nextLine();

        new Menu(name, price, category);

        sc.close();
    }
}
