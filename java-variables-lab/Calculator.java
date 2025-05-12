public class Calculator {
    public static void main(String[] args) {
        // Primitive data types
        int quantity = 5;
        double price = 10.99;
        boolean isAvailable = true;

        // Reference data type
        String itemName = "Book";

        // Arithmetic operators
        double totalCost = quantity * price;
        double tax = totalCost * 0.1; // 10% tax
        double finalCost = totalCost + tax;

        // Relational and logical operators
        boolean isExpensive = finalCost > 50.0;
        boolean canPurchase = isAvailable && !isExpensive;

        // Output results
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per unit: $" + price);
        System.out.println("Total cost: $" + totalCost);
        System.out.println("Tax: $" + tax);
        System.out.println("Final cost: $" + finalCost);
        System.out.println("Is expensive? " + isExpensive);
        System.out.println("Can purchase? " + canPurchase);
    }
}

