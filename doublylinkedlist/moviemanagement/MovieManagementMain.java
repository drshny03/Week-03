package com.tit.day01.linkedlist.doublylinkedlist.moviemanagement;

public class MovieManagementMain {

    public static void main(String[] args) {
        MovieManagement movieMang = new MovieManagement();

        // Adding predefined movies
        movieMang.addMovieAtBeginning("Inception", "Christopher Nolan", 2010, 9.0);
        movieMang.addMovieAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        movieMang.addMovieAtEnd("The Dark Knight", "Christopher Nolan", 2008, 9.1);
        movieMang.addMovieAtPosition("The Dark Knight Rises", "Christopher Nolan", 2017, 8.0, 2);

        // Display movies
        movieMang.displayMoviesForward();

        // Remove a movie
        movieMang.removeMovieByTitle("Interstellar");
        movieMang.displayMoviesForward();

        // Search for a movie
        System.out.println("\nSearching for movies directed by 'Christopher Nolan':");
        movieMang.searchMovie("Christopher Nolan", null);

        // Update a movie's rating
        System.out.println("\nUpdating rating of 'Inception':");
        movieMang.updateMovieRating("Inception", 9.3);

        // Display movies in reverse
        System.out.println("\nMovies in reverse order:");
        movieMang.displayMoviesReverse();
    }
}
