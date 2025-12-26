package arrays;
import java.util.*;
public class VotingChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		array
        int[] ages = new int[10];
//        input
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Student " + (i + 1) + " age: ");
            ages[i] = sc.nextInt();
        }
        System.out.println("Voting Eligibility Results:");
//        conditions
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age entered: " + ages[i]);
            } 
            else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } 
            else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }
	}

}
