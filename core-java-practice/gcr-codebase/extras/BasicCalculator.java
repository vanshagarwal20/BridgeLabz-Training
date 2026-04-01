package extras;

import java.util.*;

public class BasicCalculator {

	 static double add(double a, double b) { return a + b; }
	 static double subtract(double a, double b) { return a - b; }
	 static double multiply(double a, double b) { return a * b; }
	 static double divide(double a, double b) { return b != 0 ? a / b : 0; }
	 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter two numbers: ");
	        double a = sc.nextDouble();
	        double b = sc.nextDouble();

	        System.out.print("Choose operation (+ - * /): ");
	        char op = sc.next().charAt(0);

	        double result = switch (op) {
	            case '+' -> add(a, b);
	            case '-' -> subtract(a, b);
	            case '*' -> multiply(a, b);
	            case '/' -> divide(a, b);
	            default -> 0;
	        };

	        System.out.println("Result: " + result);
	}

}
