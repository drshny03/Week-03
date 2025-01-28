package com.tit.day01.linkedlist.doublylinkedlist.librarymanagement;

public class LibraryManagementMain {

    public static void main(String[] args) {
        LibraryManagement libraryManag = new LibraryManagement();

        // Adding predefined books
        libraryManag.addBookAtBeginning("The Great Gatsby", "F. Scott Fitzgerald", "Classic", "B001", true);
        libraryManag.addBookAtEnd("1984", "George Orwell", "Dystopian", "B002", true);
        libraryManag.addBookAtEnd("To Kill a Mockingbird", "Harper Lee", "Classic", "B003", false);
        libraryManag.addBookAtPosition("Moby Dick", "Herman Melville", "Adventure", "B004", true, 2);

        // Display books
        libraryManag.displayBooksForward();

        // Remove a book
        libraryManag.removeBookByID("B002");
        libraryManag.displayBooksForward();

        // Search for a book
        System.out.println("\nSearching for books by 'Harper Lee':");
        libraryManag.searchBook(null, "Harper Lee");

        // Update availability
        System.out.println("\nUpdating availability of 'Moby Dick':");
        libraryManag.updateAvailability("B004", false);

        // Display books in reverse
        System.out.println("\nBooks in reverse order:");
        libraryManag.displayBooksReverse();

        // Count total books
        System.out.println("\nTotal number of books in library: " + libraryManag.countBooks());
    }
}
