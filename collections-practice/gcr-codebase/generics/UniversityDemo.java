package generics;
import java.util.*;

abstract class CourseType {
    abstract String evaluation();
}

class ExamCourse extends CourseType {
    String evaluation() { return "Exam Based"; }
}

class AssignmentCourse extends CourseType {
    String evaluation() { return "Assignment Based"; }
}

class Course<T extends CourseType> {
    String name;
    T type;

    Course(String name, T type) {
        this.name = name;
        this.type = type;
    }

    void show() {
        System.out.println(name + " - " + type.evaluation());
    }
}

class CourseUtil {
    static void displayCourses(List<? extends CourseType> courses) {
        courses.forEach(c -> System.out.println(c.evaluation()));
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        Course<ExamCourse> math = new Course<>("Math", new ExamCourse());
        math.show();
    }
}

