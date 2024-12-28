package rental_management;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create vehicle instances
        Car car = new Car("C001", "Toyota Corolla", 50.0, true, true);
        Motorcycle motorcycle = new Motorcycle("M001", "Yamaha R15", 30.0, true, true);
        Truck truck = new Truck("T001", "Volvo FH", 100.0, true, 15.0);

        System.out.println("Welcome to the Vehicle Rental System!");
        System.out.println("Available Vehicles:");
        System.out.println("1. Car");
        System.out.println("2. Motorcycle");
        System.out.println("3. Truck");

        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        Vehicle selectedVehicle;
        switch (choice) {
            case 1:
                selectedVehicle = car;
                break;
            case 2:
                selectedVehicle = motorcycle;
                break;
            case 3:
                selectedVehicle = truck;
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        System.out.print("Enter number of days for rental: ");
        int days = scanner.nextInt();

        System.out.println("\n--- Rental Summary ---");
        System.out.println("Vehicle Selected: " + selectedVehicle.getModel());
        System.out.println("Rental Cost for " + days + " days: $" + selectedVehicle.calculateRentalCost(days));
        System.out.println("Available for rental: " + selectedVehicle.isAvailableForRental());

        System.out.print("\nWould you like to rent this vehicle? (yes/no): ");
        String rentChoice = scanner.next();

        if (rentChoice.equalsIgnoreCase("yes") && selectedVehicle.isAvailableForRental()) {
            selectedVehicle.setAvailable(false);
            System.out.println("Vehicle rented successfully! It is now unavailable for rental.");
        } else {
            System.out.println("Rental process canceled or vehicle is unavailable.");
        }

        // Return the vehicle
        System.out.print("\nDo you want to return the vehicle? (yes/no): ");
        String returnChoice = scanner.next();

        if (returnChoice.equalsIgnoreCase("yes")) {
            selectedVehicle.setAvailable(true);
            System.out.println("Vehicle returned successfully! It is now available for rental.");
        } else {
            System.out.println("You chose not to return the vehicle.");
        }

        scanner.close();
    }
}