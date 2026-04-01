package scenario_based.StudentCourse;

public class StudentCourseApp {
    public static void main(String[] args) throws Exception {

        Student s = new Student(101, "Vansh");

        s.enrollCourse("Java");
        s.enrollCourse("DBMS");
        s.assignGrade("Java", "A");
        s.assignGrade("DBMS", "B+");

        s.viewGrades();
        s.dropCourse("DBMS");
        s.viewGrades();
    }
}
