package rental_management;

public class RentalTransaction {
    private Vehicle vehicle;
    private Customer customer;
    private int days;

    public RentalTransaction(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }
}
