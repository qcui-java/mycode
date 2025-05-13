// Create a DeviceDefault class
public class DeviceDefault {
    int releaseYear;   // Class attribute for the release year
    String deviceName; // Class attribute for the device name

    // Default constructor - sets default values
    public DeviceDefault() {
        releaseYear = 2025;
        deviceName = "Apple iPhone";
    }

    // Parameterized constructor - sets values provided by the user
    public DeviceDefault(int year, String name) {
        releaseYear = year;  // Initialize the releaseYear attribute
        deviceName = name;   // Initialize the deviceName attribute
    }

    public static void main(String[] args) {
        // Using the default constructor
        DeviceDefault defaultDevice = new DeviceDefault();
        System.out.println("Default Device: " + defaultDevice.releaseYear + " " + defaultDevice.deviceName);
        
        // Using the parameterized constructor
        DeviceDefault customDevice = new DeviceDefault(2023, "Galaxy S23");
        System.out.println("Custom Device: " + customDevice.releaseYear + " " + customDevice.deviceName);
    }
}

/* 
Expected Output:
Default Device: 2025 Apple iPhone
Custom Device: 2023 Galaxy S23
*/

