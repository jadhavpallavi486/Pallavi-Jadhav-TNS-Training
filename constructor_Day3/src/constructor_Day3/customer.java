package constructor_Day3;

public class customer {

    private String customerName;
    private int customerId;
    private String customerCity;

    // Default constructor
    public customer() {
        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    // Use of this keyword
    public customer(String customerName, int customerId, String customerCity) {
        this(); // Calling the default constructor
        System.out.println("Parameterized Constructor");
        this.customerName = customerName;
        this.customerId = customerId;
        this.customerCity = customerCity;
    }

    @Override
    public String toString() {
        return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity=" + customerCity + "]";
    }

}
