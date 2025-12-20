package control_flow;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        // input from user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        // check if the year is valid
        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } 
        //proceed if the year is valid
        else {
            // Leap year logic
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
	}

}
