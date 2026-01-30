/**
 * This file is part of Week 2 exercises.
 * It contains the Books class which represents a book with its title , author and ISBN.
 * Date: 2026-01-27
 * Methods include: addBook, removeBook, listAllBooks.
 */

public class Books {

    // Attributes
    String title;
    String author;
    String isbn;

    // Mthod to add a book
    void addBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        System.out.println("Book added: " + title + " by " + author + " (ISBN: " + isbn + ")");
    }

    // Method to remove a book
    void removeBook() {
        this.title = null;
        this.author = null;
        this.isbn = null;
        System.out.println("Book removed.");
    }

    // Method to display all books
    void listAllBooks() {
        if (title != null && author != null && isbn != null) {
            System.out.println("Book: " + title + " by " + author + " (ISBN: " + isbn + ")");
        } else {
            System.out.println("No books available.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Books object
        Books myBook = new Books();

        // Add a book
        myBook.addBook("1984", "George Orwell", "1234567890");

        // List all books
        System.out.println("All Books in the Collection:");
        myBook.listAllBooks();

        // Remove the book
        myBook.removeBook();

        // List all books again
        System.out.println("New Book Collection:");
        myBook.listAllBooks();
    }
}
