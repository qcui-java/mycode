public class IntegerArrayDemo {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] numbers = {5, 10, 15, 20, 25};

        // Step 2: Display all items in the array
        System.out.println("List of numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Step 3: Calculate the sum of all numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("\nSum of numbers: " + sum);
    }
}

