package com.tit.day01.linkedlist.doublylinkedlist.moviemanagement;

public class MovieManagement {
    private MovieNode head;
    private MovieNode tail;

    // Add a movie at the beginning
    public void addMovieAtBeginning(String title, String director, int year, double rating) {
        MovieNode newMovie = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add a movie at the end
    public void addMovieAtEnd(String title, String director, int year, double rating) {
        MovieNode newMovie = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Add a movie at a specific position (1-based index)
    public void addMovieAtPosition(String title, String director, int year, double rating, int position) {
        if (position <= 1) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode newMovie = new MovieNode(title, director, year, rating);
        MovieNode temp = head;
        int count = 1;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            addMovieAtEnd(title, director, year, rating);
        } else {
            newMovie.next = temp.next;
            newMovie.prev = temp;
            temp.next.prev = newMovie;
            temp.next = newMovie;
        }
    }

    // Remove a movie by title
    public void removeMovieByTitle(String title) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head && temp == tail) { // Single node
                    head = tail = null;
                } else if (temp == head) { // Remove head
                    head = head.next;
                    head.prev = null;
                } else if (temp == tail) { // Remove tail
                    tail = tail.prev;
                    tail.next = null;
                } else { // Remove in the middle
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Movie \"" + title + "\" removed successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie \"" + title + "\" not found.");
    }

    // Search for movies by Director or Rating
    public void searchMovie(String director, Double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if ((director != null && temp.director.equalsIgnoreCase(director)) ||
                    (rating != null && temp.rating == rating)) {
                System.out.println("Movie Found: " + temp.title + " | Director: " + temp.director +
                        " | Year: " + temp.year + " | Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found matching the criteria.");
        }
    }

    // Update a movie's rating by title
    public void updateMovieRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating of movie \"" + title + "\" updated to " + newRating);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie \"" + title + "\" not found.");
    }

    // Display all movies in forward order
    public void displayMoviesForward() {
        if (head == null) {
            System.out.println("No movies to display.");
            return;
        }

        MovieNode temp = head;
        System.out.println("Movies in Forward Order:");
        while (temp != null) {
            System.out.println(temp.title + " | Director: " + temp.director + " | Year: " + temp.year + " | Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    // Display all movies in reverse order
    public void displayMoviesReverse() {
        if (tail == null) {
            System.out.println("No movies to display.");
            return;
        }

        MovieNode temp = tail;
        System.out.println("Movies in Reverse Order:");
        while (temp != null) {
            System.out.println(temp.title + " | Director: " + temp.director + " | Year: " + temp.year + " | Rating: " + temp.rating);
            temp = temp.prev;
        }
    }
}
