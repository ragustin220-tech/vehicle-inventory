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

        switch (choice){
            case 1:
                System.out.println("Inventory");
                for (int i = 0; i < vehicleCount; i++){
                    vehicle v = inventory[i];
                    System.out.println("ID: "+ v.getVehicleId() + " | " + v.getColor() + " " + v.getMakeModel()+" | Mileage: "+ v.getOdometerReading()+" | Price: $"+v.getPrice());
                }
                break;
            case 2:
                System.out.println("Price Range");

                break;
            case 3:
                System.out.println();
                break;
            case 4:
                System.out.println();
                break;
            case 5:
                System.out.println("Add new vehicle");
                System.out.print("Enter vehicle id: ");
                long newId = sc.nextLong();
                sc.nextLine();
                System.out.print("Enter make/model: ");
                String newModel = sc.nextLine();
                System.out.print("Enter color: ");
                String newColor = sc.nextLine();
                System.out.print("Enter odometer reading:");
                int newOdometer =sc.nextInt();
                System.out.print("Enter price:");
                double newPrice = sc.nextDouble();
                sc.nextLine();

                inventory[vehicleCount] = new vehicle(newId, newModel, newColor, newOdometer, newPrice);

                vehicleCount++;
                break;
            case 6:
                System.out.println();
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 6.");
        }
    }
    }
    }