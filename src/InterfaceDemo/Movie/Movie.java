package InterfaceDemo.Movie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Movie implements Comparable<Movie> {

    private double rating;
    private String name;
    private int year;

    public Movie(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Movie m) {
        return (this.year > m.year? 1: (this.year < m.year? -1: 0));
    }

    @Override
    public String toString() {
        return "Movie Title: " + this.name + "\nReleased Year: "
                + this.year + "\nRating: " + this.rating;
    }

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        //Rush hour, 10, 1998
        // Madam Web 1, 2024
        // Lion King, 7, 1994
        list.add(new Movie("Rush Hour",1998,10));
        list.add(new Movie("Madam Web", 2024, 1));
        list.add(new Movie("Lion King", 1994, 7));

        Collections.sort(list);
        System.out.println(list);
    }
}

