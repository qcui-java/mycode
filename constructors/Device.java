// Create a Device class
public class Device {
    int releaseYear;   // Class attribute for the release year
    String deviceName; // Class attribute for the device name

    // Constructor for the Device class
    public Device(int year, String name) {
        releaseYear = year;  // Initialize the releaseYear attribute
        deviceName = name;   // Initialize the deviceName attribute
    }

    public static void main(String[] args) {
        Device myPhone = new Device(2023, "Galaxy S23"); // Create an object of the Device class
        System.out.println(myPhone.releaseYear + " " + myPhone.deviceName); // Display the device details
    }
}

// Outputs: 2023 Galaxy S23

