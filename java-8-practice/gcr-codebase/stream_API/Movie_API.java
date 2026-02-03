package stream_API;

import java.util.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
}

public class Movie_API {
    public static void main(String[] args) {

        List<Movie> movies = List.of(
            new Movie("A", 8.9, 2024),
            new Movie("B", 9.1, 2023),
            new Movie("C", 8.5, 2024),
            new Movie("D", 9.3, 2025),
            new Movie("E", 8.8, 2022),
            new Movie("F", 9.0, 2024)
        );

        movies.stream()
              .filter(m -> m.year >= 2023)
              .sorted((m1, m2) -> Double.compare(m2.rating, m1.rating))
              .limit(5)
              .forEach(m -> System.out.println(m.name + " " + m.rating));
    }
}

