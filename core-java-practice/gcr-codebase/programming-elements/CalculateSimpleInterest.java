package programming_elements;
import java.util.*;
public class CalculateSimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal amount : ");
        double principal = sc.nextDouble();
        System.out.print("Enter The Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter The Time (in years): ");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + simpleInterest);
	}

}
