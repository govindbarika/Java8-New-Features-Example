package com.example.demo.java8.newfeature.bygovind.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MovieInfoUsingConsumer {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        populateMovies(movies);
        Consumer<Movie> c = movie -> {
            System.out.println("Movie Name :"+movie.name);
            System.out.println("Movie Hero :"+movie.hero);
            System.out.println("Movie Heroine :"+movie.heroine);
            System.out.println();
        };
        for (Movie m : movies) {
            c.accept(m);
        }
    }

    private static void populateMovies(List<Movie> movies) {
        movies.add(new Movie("Aarya2", "Allu Arjun", "Kajal"));
        movies.add(new Movie("Bahubali", "Prabesh", "Anushka"));
        movies.add(new Movie("Dhanakayonu", "Vijay", "Priyamani"));
        movies.add(new Movie("KGF", "Yash", "Srinidhi"));
    }

}
class Movie{
    String name;
    String hero;
    String heroine;

    public Movie(String name, String hero, String heroine) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
    }
}
