/* This is an example of a 'monolithic' code base
 * Although we only work across one file, this will become unmaintainable
 * splitting up our classes into separate files makes teamwork easier */

public class Book {

    // the main function is part of the Book class
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

    // Encapsulated fields
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Overloaded constructor (title and author only)
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    // Overloaded method: getDetails
    public String getDetails() {
        return "Title: " + title + ", Author: " + author + ", Price: $" + price;
    }

    public String getDetails(boolean includePrice) {
        if (includePrice) {
            return getDetails();
        }
        return "Title: " + title + ", Author: " + author;
    }
}

