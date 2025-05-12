public class CounterDemo {
    public static void main(String[] args) {
        int counter = 0;

        // Incrementing the counter using ++
        counter++;
        System.out.println("Counter after first increment: " + counter);

        // Using += to increment by 5
        counter += 5;
        System.out.println("Counter after += 5: " + counter);

        // Using \n to separate the next section
        System.out.println("\nCounting with \\n escape sequence:");

        // Using a loop to print numbers with \n
        for (int i = 1; i <= 3; i++) {
            System.out.print("Number " + i + "\n");
        }
    }
}

