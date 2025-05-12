public class IncrementDemo {
    public static void main(String[] args) {
        int value = 5;
        System.out.println("Initial Value: " + value);

        // Using the += operator
        value += 10;   // += operator adds 10 to the current value of the variable
        System.out.println("After += 10: " + value);

        // Using the ++ operator
        value++;      // ++ operator increments the value by 1.
        System.out.println("After ++: " + value);

        // Using the \n for new line also note the double escape
        System.out.println("\nThis is a demonstration of the \\n escape sequence.");
    }
}

