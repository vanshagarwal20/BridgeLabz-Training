package scenario_based.OnlineExam;


import java.util.*;
class ObjectiveEvaluation implements EvaluationStrategy {
    public int evaluate(List<Question> questions, Map<Integer, String> answers) {
        int score = 0;
        for (Question q : questions) {
            if (q.getCorrectAnswer().equalsIgnoreCase(answers.get(q.getId()))) {
                score += q.getMarks();
            }
        }
        return score;
    }
}
