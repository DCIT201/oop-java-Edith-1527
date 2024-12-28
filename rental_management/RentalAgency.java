package rental_management;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<RentalTransaction> transactions = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public boolean rentVehicle(String vehicleId, Customer customer, int days) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleId().equals(vehicleId) && vehicle.isAvailableForRental()) {
                vehicle.setAvailable(false);
                transactions.add(new RentalTransaction(vehicle, customer, days));
                customer.addLoyaltyPoints(days); // Loyalty points based on days
                return true;
            }
        }
        return false;
    }

    public void returnVehicle(String vehicleId) {
        for (RentalTransaction transaction : transactions) {
            if (transaction.getVehicle().getVehicleId().equals(vehicleId)) {
                transaction.getVehicle().setAvailable(true);
                return;
            }
        }
    }

    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> availableVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.isAvailableForRental()) {
                availableVehicles.add(vehicle);
            }
        }
        return availableVehicles;
    }
}