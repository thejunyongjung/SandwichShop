package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        // STEP 1
        System.out.println("Welcome to the Sandwich Shop!");
        System.out.println("1. Regular: base price $5.45");
        System.out.println("2. Large: base price $8.95\n");
        System.out.print("Choose 1 or 2: ");
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
        }

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

        System.out.println("The total cost is: $" + priceOfSandwich);

    }
}
