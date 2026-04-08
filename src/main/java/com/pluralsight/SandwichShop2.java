package com.pluralsight;

import java.util.Scanner;

public class SandwichShop2 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        // STEP 1
        System.out.println("Welcome to the Sandwich Shop!");
        System.out.println("1. Regular: base price $5.45");
        System.out.println("2. Large: base price $8.95\n");
        System.out.print("Choose 1 or 2: ");

        // Size? - Base Price
        int choice = read.nextInt();

        double priceOfSandwich = 0;
        if (choice == 1) {
            priceOfSandwich = 5.45;
        }
        else if (choice == 2) {
            priceOfSandwich = 8.95;
        }
        else {
            System.out.println("Invalid choice");
            read.close();
            return;
        }
        // Taking out the Buffer
        read.nextLine();

        // Loaded? - Additional Charge
        System.out.print("Would you like to make it loaded? (y/n): ");
        String loaded = read.nextLine();

        double regularLoaded = 1.00;
        double largeLoaded = 1.75;
        if (loaded.equals("y") && (choice == 1)) {
            System.out.printf("Additional Charge of $%.2f\n\n", regularLoaded);
            priceOfSandwich += regularLoaded;
        }
        else if (loaded.equals("y") && (choice == 2)) {
            System.out.printf("Additional Charge of $%.2f\n\n", largeLoaded);
            priceOfSandwich += largeLoaded;
        }
        else if (loaded.equals("n")){
            System.out.print("No Additional Charge\n\n");
        }
        else{
            System.out.println("Invalid choice");
            read.close();
            return;
        }

        // Age? - Discount
        System.out.print("Your age?: ");
        int age = read.nextInt();

        if (age <= 17) {
            System.out.println("10% discount");
            priceOfSandwich *= 0.90;
        }
        else if (age >= 65) {
            System.out.println("20% discount");
            priceOfSandwich *= 0.80;
        }
        else {
            System.out.println("No Discount");
        }

        System.out.printf("The total cost is: $%.2f", priceOfSandwich);

        read.close();
    }
}
