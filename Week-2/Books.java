/**
 * This file is part of Week 2 exercises.
 * It contains the Books class which represents a book with its title , author and ISBN.
 * Date: 2026-01-27
 * Methods include: addBook, removeBook, listAllBooks.
 */
import java.util.Scanner;

public class Books {

    // Attributes
    String title = "";
    String author = "";
    String isbn = "";

    // Mthod to add a book
    void addBook(Scanner input) {
        System.out.print("Enter book title: ");
        this.title = input.nextLine();
        System.out.print("Enter book author: ");
        this.author = input.nextLine();
        System.out.print("Enter book ISBN: ");
        this.isbn = input.nextLine();
        System.out.println("Book added: " + title + " by " + author + " (ISBN: " + isbn + ")");
    }

    // Method to remove a book
    void removeBook() {
        if (title != null && author != null && isbn != null) {
            System.out.println("Removing book: " + title + " by " + author + " (ISBN: " + isbn + ")");
            title = null;
            author = null;
            isbn = null;
        } else {
            System.out.println("No book to remove.");
        }
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
    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Books book = new Books();
        int choice;

        do {
            // Menu
            System.out.println("==== BOOK MENU ====");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Display Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();
            input.nextLine(); // clear buffer

            if (choice == 1) {
                book.addBook(input);
            } 
            else if (choice == 2) {
                book.removeBook();
            } 
            else if (choice == 3) {
                book.listAllBooks();
            } 
            else if (choice == 4) {
                System.out.println("Goodbye!");
            } 
            else {
                System.out.println("Invalid choice.\n");
            }

        } while (choice != 4);

        input.close();
    }
}
