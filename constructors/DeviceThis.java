// Create a DeviceThis class
public class DeviceThis {
    int releaseYear;   // Class attribute for the release year
    String deviceName; // Class attribute for the device name

    // Default constructor - sets default values
    public DeviceThis() {
        this.releaseYear = 2025;        // Using 'this' to reference the class attribute
        this.deviceName = "Apple iPhone"; // Using 'this' to reference the class attribute
    }

    // Parameterized constructor - sets values provided by the user
    public DeviceThis(int releaseYear, String deviceName) {
        // Using 'this' to distinguish between parameter names and class attributes
        this.releaseYear = releaseYear;   // without this it would read releaseYear = ReleaseYear (bad)
        this.deviceName = deviceName;   // without this it would read deviceName = deviceName (bad)
    }

    public static void main(String[] args) {
        // Using the default constructor
        DeviceThis defaultDevice = new DeviceThis();
        System.out.println("Default Device: " + defaultDevice.releaseYear + " " + defaultDevice.deviceName);
        
        // Using the parameterized constructor
        DeviceThis customDevice = new DeviceThis(2023, "Galaxy S23");
        System.out.println("Custom Device: " + customDevice.releaseYear + " " + customDevice.deviceName);
    }
}

/* 
Expected Output:
Default Device: 2025 Apple iPhone
Custom Device: 2023 Galaxy S23
*/

