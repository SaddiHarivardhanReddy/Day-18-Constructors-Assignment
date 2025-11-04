package com.codegnan.oopexamples;

import java.util.Scanner;

public class Car {
    String brand;
    String model;
    double pricePerDay;


    public Car(String brand, String model, double pricePerDay) {
        if (brand == null) {
            System.out.println("Error: Brand cannot be empty");
            return;
        }

        if (model == null) {
            System.out.println("Error: Model cannot be empty");
            return;
        }

        if (pricePerDay <= 0) {
            System.out.println("Error: Rental price must be positive");
            return;
        }

        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;

        displayCarInfo();
    }

    
    public void displayCarInfo() {
        System.out.printf("Brand: %s, Model: %s, Price per Day: %.2f%n", brand, model, pricePerDay);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String brand = sc.nextLine();
        String model = sc.nextLine();
        double price = sc.nextDouble();

        new Car(brand, model, price);

        sc.close();
    }
}
