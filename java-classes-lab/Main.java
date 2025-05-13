public class Main {
    public static void main(String[] args) {
        // Create books using different constructors
        Book book1 = new Book();
        Book book2 = new Book("Java Programming", "John Doe", 29.99);
        Book book3 = new Book("Python Basics", "Jane Smith");

        // Modify book1 using setters
        book1.setTitle("OOP Concepts");
        book1.setAuthor("Alice Brown");
        book1.setPrice(19.99);

        // Test encapsulation (try invalid price)
        book1.setPrice(-5.0); // Should not change price

        // Test overloaded methods
        System.out.println("Book 1 Details (full): " + book1.getDetails());
        System.out.println("Book 1 Details (no price): " + book1.getDetails(false));
        System.out.println("Book 2 Details (full): " + book2.getDetails());
        System.out.println("Book 3 Details (no price): " + book3.getDetails(false));

        // Test getters
        System.out.println("Book 2 Title: " + book2.getTitle());
        System.out.println("Book 3 Price: $" + book3.getPrice());
    }
}

