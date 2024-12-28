package rental_management;


public class Car extends Vehicle {
    private boolean hasGPS;

    public Car(String vehicleId, String model, double baseRentalRate, boolean isAvailable, boolean hasGPS) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.hasGPS = hasGPS;
    }

    public boolean hasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = days * getBaseRentalRate();
        if (hasGPS) {
            cost += 5 * days;
            // Additional cost for GPS
        }
        return cost;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }


    public void displayInfo() {
    }
}
