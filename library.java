public class library {
    public static void main(String[] args) {
        Book b1 = new Book("Les Miserables", "Victor Hugo", 1560);
        Book b2 = new Book("To the Lighthouse", "Virginia Woolf", 200);

        b1.print();
        b2.print();
        // Task 5: Call the displayDetails method for each object.
    }
}

// Define the Book class
class Book {
    private String title;
    private String author;
    private int numPages;
    // Task 1: Add three attributes: title, author, and numberOfPages.

    // Constructor
    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        // Task 2: Initialize the attributes inside this constructor.
    }

    public void print(){
        System.out.println("Title: " + title);
        System.out.println("Author: "+ author);
        System.out.println("Number of pages: " + numPages);
    }
    // Task 3: Add a method displayDetails() to print the book's details (title, author, and numberOfPages).
}
