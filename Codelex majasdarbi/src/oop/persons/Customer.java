package oop.persons;

public class Customer extends Person {

    private String customerId;
    private int purchaseCount;


    public Customer(String firstName, String lastName, String id, int age, String customerId, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.customerId = customerId;
        this.purchaseCount = purchaseCount;
    }

    @Override
    public String getInfo() {
        return firstName + " " + lastName + " " + customerId + ", has purchase count of: " + purchaseCount + ".";
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }
}
