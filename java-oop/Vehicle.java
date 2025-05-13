// This program demonstrates the concept of objects and instance variables in Java

public class Vehicle {
    int speed = 60; // Instance variable representing the speed of the vehicle

    public static void main(String[] args) {
        // Creating two different Vehicle objects
        Vehicle car = new Vehicle();  // Object 1
        Vehicle bike = new Vehicle(); // Object 2
        
        // Printing the speed value for each object
        System.out.println("Car speed: " + car.speed);
        System.out.println("Bike speed: " + bike.speed);
        
        // Modifying the speed for one object (bike)
        bike.speed = 45;
        
        // Printing the speed values again after modification
        System.out.println("Car speed after change: " + car.speed);
        System.out.println("Bike speed after change: " + bike.speed);
    }
}

