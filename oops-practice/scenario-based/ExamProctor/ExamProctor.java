package scenario_based.ExamProctor;

import java.util.*;

	//Exam Proctor System
	class ExamProctor {
	 private Stack<Integer> navigationStack = new Stack<>();
	 private HashMap<Integer, String> answers = new HashMap<>();
	 private HashMap<Integer, String> correctAnswers = new HashMap<>();
	
	 ExamProctor() {
	//      Preloaded correct answers
	     correctAnswers.put(1, "A");
	     correctAnswers.put(2, "B");
	     correctAnswers.put(3, "C");
	 }
	
	//  Navigate to question
	 public void visitQuestion(int qId) {
	     navigationStack.push(qId);
	     System.out.println("Visited Question: " + qId);
	 }
	
	//  Store answer
	 public void submitAnswer(int qId, String answer) {
	     answers.put(qId, answer);
	 }
	
	//  Auto-evaluate score
	 public int calculateScore() {
	     int score = 0;
	
	     for (int qId : answers.keySet()) {
	         if (answers.get(qId).equals(correctAnswers.get(qId)))
	             score++;
	     }
	     return score;
	 }
	
	//  Last visited question
	 public void lastVisited() {
	     if (navigationStack.isEmpty())
	         System.out.println("No navigation history!");
	     else
	         System.out.println("Last Visited Question: " + navigationStack.peek());
	 }
	}
