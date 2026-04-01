package control_flow;
import java.util.*;
public class LeapYearUsingSingleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        // input from user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        // Check if year is valid or not
        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } 
        // Single if statement for leap year calculations
        else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } 
        // Else case if not a leap year
        else {
            System.out.println(year + " is not a Leap Year.");
        }

	}

}
