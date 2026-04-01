package scenario_based.StudentCourse;

interface RegistrationService {
    void enrollCourse(String course) throws CourseLimitExceededException;
    void dropCourse(String course);
    void assignGrade(String course, String grade);
}
