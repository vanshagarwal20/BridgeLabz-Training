package collectors;

import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentGrouping {
    public static void main(String[] args) {
        List<Student> students = List.of(
            new Student("Aman", "A"),
            new Student("Riya", "B"),
            new Student("Neha", "A"),
            new Student("Karan", "C")
        );

        Map<String, List<String>> result =
            students.stream()
                    .collect(Collectors.groupingBy(
                        s -> s.grade,
                        Collectors.mapping(s -> s.name, Collectors.toList())
                    ));

        System.out.println(result);
    }
}

