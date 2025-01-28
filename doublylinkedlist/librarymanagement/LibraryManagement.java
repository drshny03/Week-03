package com.tit.day01.linkedlist.doublylinkedlist.librarymanagement;

public class LibraryManagement {

    private BookNode head;
    private BookNode tail;
    private int bookCount;

    public LibraryManagement() {
        this.head = null;
        this.tail = null;
        this.bookCount = 0;
    }

    // Add a new book at the beginning
    public void addBookAtBeginning(String title, String author, String genre, String bookID, boolean isAvailable) {
        BookNode newBook = new BookNode(title, author, genre, bookID, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        bookCount++;
    }

    // Add a new book at the end
    public void addBookAtEnd(String title, String author, String genre, String bookID, boolean isAvailable) {
        BookNode newBook = new BookNode(title, author, genre, bookID, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        bookCount++;
    }

    // Add a new book at a specific position (1-based index)
    public void addBookAtPosition(String title, String author, String genre, String bookID, boolean isAvailable, int position) {
        if (position <= 1) {
            addBookAtBeginning(title, author, genre, bookID, isAvailable);
            return;
        }
        if (position > bookCount) {
            addBookAtEnd(title, author, genre, bookID, isAvailable);
            return;
        }

        BookNode newBook = new BookNode(title, author, genre, bookID, isAvailable);
        BookNode temp = head;
        int count = 1;

        while (count < position - 1) {
            temp = temp.next;
            count++;
        }

        newBook.next = temp.next;
        newBook.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newBook;
        }
        temp.next = newBook;
        bookCount++;
    }

    // Remove a book by Book ID
    public void removeBookByID(String bookID) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookID.equals(bookID)) {
                if (temp == head && temp == tail) { // Single node
                    head = tail = null;
                } else if (temp == head) { // Remove head
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else if (temp == tail) { // Remove tail
                    tail = tail.prev;
                    if (tail != null) {
                        tail.next = null;
                    }
                } else { // Remove from middle
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                bookCount--;
                System.out.println("Book with ID \"" + bookID + "\" removed successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book with ID \"" + bookID + "\" not found.");
    }

    // Search for a book by Title or Author
    public void searchBook(String title, String author) {
        BookNode temp = head;
        boolean found = false;

        while (temp != null) {
            if ((title != null && temp.title.equalsIgnoreCase(title)) ||
                    (author != null && temp.author.equalsIgnoreCase(author))) {
                System.out.println("Book Found: " + temp.title + " | Author: " + temp.author +
                        " | Genre: " + temp.genre + " | ID: " + temp.bookID +
                        " | Available: " + (temp.isAvailable ? "Yes" : "No"));
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No books found matching the criteria.");
        }
    }

    // Update a book's Availability Status
    public void updateAvailability(String bookID, boolean newStatus) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookID.equals(bookID)) {
                temp.isAvailable = newStatus;
                System.out.println("Availability of book \"" + temp.title + "\" updated to " + (newStatus ? "Available" : "Not Available"));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book with ID \"" + bookID + "\" not found.");
    }

    // Display all books in forward order
    public void displayBooksForward() {
        if (head == null) {
            System.out.println("No books to display.");
            return;
        }

        BookNode temp = head;
        System.out.println("Books in Forward Order:");
        while (temp != null) {
            System.out.println(temp.title + " | Author: " + temp.author + " | Genre: " + temp.genre +
                    " | ID: " + temp.bookID + " | Available: " + (temp.isAvailable ? "Yes" : "No"));
            temp = temp.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksReverse() {
        if (tail == null) {
            System.out.println("No books to display.");
            return;
        }

        BookNode temp = tail;
        System.out.println("Books in Reverse Order:");
        while (temp != null) {
            System.out.println(temp.title + " | Author: " + temp.author + " | Genre: " + temp.genre +
                    " | ID: " + temp.bookID + " | Available: " + (temp.isAvailable ? "Yes" : "No"));
            temp = temp.prev;
        }
    }

    // Count the total number of books
    public int countBooks() {
        return bookCount;
    }
}

