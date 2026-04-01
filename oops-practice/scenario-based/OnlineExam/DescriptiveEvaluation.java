package scenario_based.OnlineExam;


import java.util.*;
class DescriptiveEvaluation implements EvaluationStrategy {
    public int evaluate(List<Question> questions, Map<Integer, String> answers) {
        return questions.size() * 5;
    }
}
