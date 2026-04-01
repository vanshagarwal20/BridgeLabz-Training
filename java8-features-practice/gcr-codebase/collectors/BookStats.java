package collectors;

import java.util.*;
import java.util.stream.*;

class Book {
    String genre;
    int pages;

    Book(String genre, int pages) {
        this.genre = genre;
        this.pages = pages;
    }
}

public class BookStats {
    public static void main(String[] args) {
        List<Book> books = List.of(
            new Book("Fiction", 300),
            new Book("Fiction", 450),
            new Book("Science", 500)
        );

        Map<String, IntSummaryStatistics> stats =
            books.stream()
                 .collect(Collectors.groupingBy(
                     b -> b.genre,
                     Collectors.summarizingInt(b -> b.pages)
                 ));

        System.out.println(stats);
    }
}

