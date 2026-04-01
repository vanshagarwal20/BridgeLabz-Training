package scenario_based;

//	Custom Exception
	class InvalidScoreException extends Exception {
	 public InvalidScoreException(String message) {
	     super(message);
	 }
	}
	
	public class StudentScoreAnalyzer {
	
//	  Method to calculate average
	 public static double calculateAverage(int[] scores) throws InvalidScoreException {
	     int sum = 0;
	     for (int score : scores) {
	         validateScore(score);
	         sum += score;
	     }
	     return (double) sum / scores.length;
	 }
	
//	  Method to find maximum score
	 public static int findMax(int[] scores) throws InvalidScoreException {
	     int max = scores[0];
	     for (int score : scores) {
	         validateScore(score);
	         if (score > max)
	             max = score;
	     }
	     return max;
	 }
	
//	  Method to find minimum score
	 public static int findMin(int[] scores) throws InvalidScoreException {
	     int min = scores[0];
	     for (int score : scores) {
	         validateScore(score);
	         if (score < min)
	             min = score;
	     }
	     return min;
	 }
	
//	  Validation method
	 private static void validateScore(int score) throws InvalidScoreException {
	     if (score < 0 || score > 100) {
	         throw new InvalidScoreException("Invalid score found: " + score);
	     }
	 }
	
	 public static void main(String[] args) {
	     int[] scores = {85, 90, 78, 88};
	
	     try {
	         System.out.println("Average Score: " + calculateAverage(scores));
	         System.out.println("Highest Score: " + findMax(scores));
	         System.out.println("Lowest Score: " + findMin(scores));
	     } catch (InvalidScoreException e) {
	         System.out.println(e.getMessage());
	     }
	 }
	}

