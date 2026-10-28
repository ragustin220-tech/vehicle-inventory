package com.pluralsight;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    vehicle[] inventory = new vehicle[20];
    int vehicleCount = 0;

    inventory[vehicleCount] = new vehicle(1011,"Ford Explorer", "Red", 45000, 13500.00);
    vehicleCount++;
    inventory[vehicleCount] = new vehicle(1012,"Toyota Camry", "Blue", 60000, 15000.00);
    vehicleCount++;
    inventory[vehicleCount] = new vehicle(1013,"Honda Civil", "Black", 30000, 17500.00);
    vehicleCount++;
    inventory[vehicleCount] = new vehicle(1014,"Chevrolet Silverado", "white", 85000, 22000.00);
    vehicleCount++;
    inventory[vehicleCount] = new vehicle(1015,"Jeep Wrangler", "Green", 20000, 28000.00);
    vehicleCount++;
    inventory[vehicleCount] = new vehicle(1016,"Nissan Altima", "Silver", 50000, 12000.00);
    vehicleCount++;


    Scanner sc = new Scanner(System.in);
    int choice = 0;

    while (choice != 6) {

        System.out.println("\n--- VEHICLE INVENTORY MENU---");
        System.out.println("1. list all vehicles");
        System.out.println("2.Find a vehicle by price range");
        System.out.println("3.Find a vehicle by make/model");
        System.out.println("4.Find a vehicle by color");
        System.out.println("5.Add a vehicle");
        System.out.println("6.quit");
        System.out.println("Enter your choice (1-6): ");

        choice = sc.nextInt();
        sc.nextLine();
    }
    }
}