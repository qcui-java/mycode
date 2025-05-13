public class Converter {
    // Static method - can be called without creating an object
    static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Instance (public) method - must be called using an object
    public double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Main method
    public static void main(String[] args) {
        // Calling the static method directly without an object
        double tempInFahrenheit = convertCelsiusToFahrenheit(25);
        System.out.println("25°C in Fahrenheit: " + tempInFahrenheit);

        // Trying to call the instance method without an object (Uncommenting will cause an error)
        // convertFahrenheitToCelsius(77);

        // Creating an object of the Converter class
        Converter myConverter = new Converter();
        
        // Using the object to call the instance method
        double tempInCelsius = myConverter.convertFahrenheitToCelsius(77);
        System.out.println("77°F in Celsius: " + tempInCelsius);
    }
}

