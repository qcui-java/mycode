public class NestedIfDemo {
    public static void main(String[] args) {
        int age = 25;
        boolean hasID = true;

        // Nested if to check age and ID status
        if (age >= 18) {
            if (hasID) {
                System.out.println("You are allowed to enter.");
            } else {
                System.out.println("ID is required.");
            }
        } else {
            System.out.println("You are not old enough to enter.");
        }
    }
}

