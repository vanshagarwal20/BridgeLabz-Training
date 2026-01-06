package scenario_based;

import java.util.*;

	class InvalidMarkException extends Exception {
	    public InvalidMarkException(String msg) {
	        super(msg);
	    }
	}
	
	class Student {
	    String name;
	    int[] marks;
	
	    Student(String name, int[] marks) {
	        this.name = name;
	        this.marks = marks;
	    }
	}
	
	public class StudentReportGenerator {
	    static String[] subjects = {"Math", "Science", "English"};
	
	    public static double calculateAverage(int[] marks) throws InvalidMarkException {
	        int sum = 0;
	        for (int m : marks) {
	            if (m < 0 || m > 100)
	                throw new InvalidMarkException("Invalid marks found");
	            sum += m;
	        }
	        return sum / (double) marks.length;
	    }
	
	    public static String assignGrade(double avg) {
	        if (avg >= 80) return "A";
	        if (avg >= 60) return "B";
	        if (avg >= 40) return "C";
	        return "Fail";
	    }
	
	    public static void displayReport(Student s) throws InvalidMarkException {
	        System.out.println("Report Card: " + s.name);
	        for (int i = 0; i < subjects.length; i++) {
	            System.out.println(subjects[i] + ": " + s.marks[i]);
	        }
	        double avg = calculateAverage(s.marks);
	        System.out.println("Average: " + avg);
	        System.out.println("Grade: " + assignGrade(avg));
	    }
	
	    public static void main(String[] args) throws Exception {
	        List<Student> students = new ArrayList<>();
	        students.add(new Student("Rohit", new int[]{85, 75, 90}));
	
	        displayReport(students.get(0));
	    }
	}

