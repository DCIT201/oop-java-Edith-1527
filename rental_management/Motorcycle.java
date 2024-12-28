package rental_management;



public class Motorcycle extends Vehicle {
    private boolean hasHelmet;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean isAvailable, boolean hasHelmet) {
        super(vehicleId, model, baseRentalRate, isAvailable);
        this.hasHelmet = hasHelmet;
    }

    public boolean hasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getBaseRentalRate();
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void displayInfo() {

    }

}