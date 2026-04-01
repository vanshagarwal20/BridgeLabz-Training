package scenario_based.StudentCourse;

import java.util.*;

class Student extends Person implements RegistrationService {

    private static final int MAX_COURSES = 3;
    private List<String> courses = new ArrayList<>();
    private Map<String, String> grades = new HashMap<>();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void enrollCourse(String course) throws CourseLimitExceededException {
        if (courses.size() >= MAX_COURSES) {
            throw new CourseLimitExceededException("Course limit exceeded");
        }
        courses.add(course);
        System.out.println(course + " enrolled");
    }

    public void dropCourse(String course) {
        courses.remove(course);
        grades.remove(course);
        System.out.println(course + " dropped");
    }

    public void assignGrade(String course, String grade) {
        if (courses.contains(course)) {
            grades.put(course, grade);
        }
    }

    public void viewGrades() {
        System.out.println("Grades: " + grades);
    }
}
