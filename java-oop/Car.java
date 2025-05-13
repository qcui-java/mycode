// Java program demonstrating an object with a different class and variable name

public class Car {
    int speed = 120;

    public static void main(String[] args) {
        // Creating an object of the Car class
        Car sportsCar = new Car();
        
        // Displaying the value of the speed variable
        System.out.println("The speed of the sportsCar is: " + sportsCar.speed + " km/h");
    }
}

