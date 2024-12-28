package rental_management;


public class Customer {
    private String name;
    private String customerId;
    private int loyaltyPoints;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
        this.loyaltyPoints = 0;
    }

    public String getName() {
        return name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void addLoyaltyPoints(int points) {
        if (points > 0) {
            this.loyaltyPoints += points;
        }
    }
}