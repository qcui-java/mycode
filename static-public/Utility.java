public class Utility {
    // Static method
    static void displayStaticMessage() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Instance (public) method
    public void showInstanceMessage() {
        System.out.println("Instance methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        displayStaticMessage(); // Call the static method directly
        
        // Attempting to call an instance method without an object would cause an error
        // showInstanceMessage(); // Uncommenting this line will cause a compilation error

        // Creating an object of the Utility class
        Utility tool = new Utility(); 
        tool.showInstanceMessage(); // Call the instance method using the object
    }
}

