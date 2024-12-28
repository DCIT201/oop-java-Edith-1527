package rental_management;

public class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, boolean isAvailable, double cargoCapacity) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getBaseRentalRate() + (cargoCapacity * 5); // Additional cost based on cargo capacity
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void displayInfo() {

    }


}