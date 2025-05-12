public class BooleanArrayDemo {
    public static void main(String[] args) {
        // Step 1: Create an array of boolean values
        boolean[] answers = {true, false, true, false};

        // Step 2: Display all boolean values
        System.out.println("List of boolean values:");
        for (int i = 0; i < answers.length; i++) {
            System.out.println("Answer " + (i + 1) + ": " + answers[i]);
        }

        // Step 3: Count the number of true values
        int trueCount = 0;
        for (boolean answer : answers) {
            if (answer) {
                trueCount++;
            }
        }

        System.out.println("\nNumber of true values: " + trueCount);
    }
}

