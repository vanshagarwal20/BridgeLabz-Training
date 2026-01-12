package scenario_based.OnlineExam;


import java.util.*;
class Exam {
    private List<Question> questions = new ArrayList<>();
    private EvaluationStrategy evaluationStrategy;
    private boolean timeExpired = false;

    public Exam(EvaluationStrategy evaluationStrategy) {
        this.evaluationStrategy = evaluationStrategy;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public int submitAnswers(Map<Integer, String> answers) throws ExamTimeExpiredException {
        if (timeExpired) {
            throw new ExamTimeExpiredException("Exam time expired");
        }
        return evaluationStrategy.evaluate(questions, answers);
    }

    public void expireTime() {
        timeExpired = true;
    }
}