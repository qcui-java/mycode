// This program demonstrates the concept of objects and instance variables in Java

public class Vehiclefail {
    // final will prevent changes to this variable
    final int speed = 60; // Instance variable representing the speed of the vehicle

    public static void main(String[] args) {
        // Creating two different Vehiclefail objects
        Vehiclefail car = new Vehiclefail();  // Object 1
        Vehiclefail bike = new Vehiclefail(); // Object 2
        
        // Printing the speed value for each object
        System.out.println("Car speed: " + car.speed);
        System.out.println("Bike speed: " + bike.speed);
        
        // Modifying the speed for one object (bike)
        // will generate an error: cannot assign a value to a final variable
        bike.speed = 45;
        
        // Printing the speed values again after modification
        System.out.println("Car speed after change: " + car.speed);
        System.out.println("Bike speed after change: " + bike.speed);
    }
}

