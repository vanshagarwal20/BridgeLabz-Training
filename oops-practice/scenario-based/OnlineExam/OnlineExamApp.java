package scenario_based.OnlineExam;

import java.util.*;

public class OnlineExamApp {
    public static void main(String[] args) throws Exception {

        Student student = new Student(101, "Vansh");

        Exam exam = new Exam(new ObjectiveEvaluation());

        exam.addQuestion(new Question(1, "Java is OOP?", "Yes", 5));
        exam.addQuestion(new Question(2, "2 + 2 ?", "4", 5));

        Map<Integer, String> answers = new HashMap<>();
        answers.put(1, "Yes");
        answers.put(2, "4");

        int result = exam.submitAnswers(answers);
        System.out.println("Result Score: " + result);
    }
}
