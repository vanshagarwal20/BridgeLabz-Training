package reflection;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name = "Vansh Agarwal")
class Book { }

public class AnnotationDemo {
    public static void main(String[] args) {

        Author author = Book.class.getAnnotation(Author.class);
        System.out.println("Author: " + author.name());
    }
}

