package constructor_Day3;

public class constructor {
    public static void main(String[] args) {
        // Creating an object using the default constructor
        customer customer1 = new customer();

        // Creating an object using the parameterized constructor
        customer customer2 = new customer("John Doe", 12345, "New York");

        // Printing the objects
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
