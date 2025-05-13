// This program demonstrates the concept of objects and instance variables in Java

public class Book {
    String title = "Java Programming Basics";  // Instance variable representing book title
    String author = "Alice Smith";             // Instance variable representing book author
    int pages = 350;                           // Instance variable representing number of pages

    public static void main(String[] args) {
        // Creating a Book object
        Book myBook = new Book();
        
        // Displaying the book's details using the instance variables
        System.out.println("Book Title: " + myBook.title);
        System.out.println("Author: " + myBook.author);
        System.out.println("Number of Pages: " + myBook.pages);
        
        // Modifying the book's details (showing that instance variables are unique to the object)
        myBook.title = "Advanced Java Techniques";
        myBook.pages = 450;

        // Displaying the updated book details
        System.out.println("\nUpdated Book Details:");
        System.out.println("Book Title: " + myBook.title);
        System.out.println("Author: " + myBook.author);
        System.out.println("Number of Pages: " + myBook.pages);
    }
}

