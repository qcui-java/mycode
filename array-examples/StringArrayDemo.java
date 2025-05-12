public class StringArrayDemo {
    public static void main(String[] args) {
        // Step 1: Create an array of strings
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

        // Step 2: Display all items in the array
        System.out.println("List of fruits:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // Step 3: Access a specific element
        System.out.println("\nMy favorite fruit is: " + fruits[1]);
    }
}

