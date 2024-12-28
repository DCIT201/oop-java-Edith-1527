package rental_management;


public abstract class Vehicle {
    // Private encapsulated fields
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;

    // constructors with validation
    public Vehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        if (vehicleId == null || vehicleId.isEmpty() || model == null || model.isEmpty() || baseRentalRate < 0) {
            throw new IllegalArgumentException("Invalid input exception for Vehicle fields.");
        }
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;

    }

    //Setters and Getters with validation
    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        if (baseRentalRate < 0) {
            throw new IllegalArgumentException("Base rental rate cannot be negative.");
        }
        this.baseRentalRate = baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    //Abstract methods
    public abstract double calculateRentalCost(int daysRented);

    public abstract boolean isAvailableForRental();

    @Override
    public String toString() {
        return "VehicleId:" + vehicleId + "\nModel:" + model + "\nBaseRentalRate:" + baseRentalRate;
    }

    public void setAvailable(boolean b) {
    }

    public abstract void displayInfo();
}