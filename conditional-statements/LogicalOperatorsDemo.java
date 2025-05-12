public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        int age = 20;
        boolean hasTicket = true;

        // If statement with logical AND (&&) operator
        if (age >= 18 && hasTicket) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
}

