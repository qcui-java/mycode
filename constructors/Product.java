// Create a Product class
public class Product {
    int quantity;  // Create a class attribute

    // Create a class constructor for the Product class
    public Product() {
        quantity = 10;  // Set the initial value for the class attribute quantity
    }

    public static void main(String[] args) {
        Product item = new Product(); // Create an object of class Product (This will call the constructor)
        System.out.println("Initial Quantity: " + item.quantity); // Print the value of quantity
    }
}

// Outputs: Initial Quantity: 10

