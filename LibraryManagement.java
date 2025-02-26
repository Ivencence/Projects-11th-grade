import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Book[] bookArray = {
                new Book("War and Peace", "Leo Tolstoy", 1867),
                new Book("Great Expectations", "Charles Dickens", 1861),
                new Book("The Three Musketeers", "Alexander Dumas", 1844),
                new Book("Faust", "Johan Wolfgang von Goethe", 1790)};

        Scanner scanner = new Scanner(System.in);

        displayLibrary(bookArray);
        borrowBook(bookArray, scanner);
        returnBook(bookArray, scanner);
        findBookByTitle(bookArray, scanner);
    }

    public static void displayLibrary(Book[] books) {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book.getDetails());
        }
    }

    public static void borrowBook(Book[] books, Scanner scanner) {
        System.out.println("Enter your name:");
        String borrowerName = scanner.nextLine();
        System.out.println("Enter the title of the book you want to borrow:");
        String input = scanner.nextLine();
        System.out.println(borrowerName + " have borrowed: " + input);
    }

    public static void returnBook(Book[] books, Scanner scanner) {
        System.out.println("Enter the title of the book you want to return:");
        String input = scanner.nextLine();
        System.out.println("You have returned: " + input);
    }

    public static void findBookByTitle(Book[] books, Scanner scanner) {
        System.out.println("Enter the title of the book you are looking for:");
        String title = scanner.nextLine();
        System.out.println("Book is available.");
    }
}

class Book {
    String title;
    String author;
    int yearPublished;
    String borrowerName;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.borrowerName = null;
    }

    public String getDetails() {
        return title + " by " + author + " (" + yearPublished + ")" + (borrowerName != null ? " - Borrowed by: " + borrowerName : "");
    }

    public void updateBookInfo(String newTitle, String newAuthor, int newYearPublished) {
        this.title = newTitle;
        this.author = newAuthor;
        this.yearPublished = newYearPublished;
    }

    public void borrowBook(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public void returnBook() {
        this.borrowerName = null;
    }

    public String getBorrowerName() {
        return borrowerName;
    }
}
