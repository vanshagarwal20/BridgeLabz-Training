package control_flow;
import java.util.*;
public class EmployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Scanner sc = new Scanner(System.in);
	        System.out.print("Enter employee salary = ");
	        double salary = sc.nextDouble();
	        System.out.print("Enter years of service = ");
	        int year = sc.nextInt();
	        double bonus = 0;
	        if (year > 5) {
	            bonus = salary * 0.05;
	            System.out.println("Bonus amount: " + bonus);
	        } else {
	            System.out.println("No bonus applicable as your agreement is less than 5 years.");
	        }
	}

}
