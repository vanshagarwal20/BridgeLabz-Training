package programming_elements;
import java.util.*;
public class CalculateAverageOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average = " + average);

	}

}
