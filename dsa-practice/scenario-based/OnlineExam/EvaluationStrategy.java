package scenario_based.OnlineExam;

import java.util.*;

interface EvaluationStrategy {
    int evaluate(List<Question> questions, Map<Integer, String> answers);
}
