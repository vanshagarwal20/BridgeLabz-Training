package control_flow;
import java.util.*;
public class VotingAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);        
        System.out.print("Enter age: ");
        int age = sc.nextInt();    
//        checker
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
        sc.close();
	}

}
