package control_flow;

import java.util.*;

public class NumberMultiplesWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        // Take input from user
        System.out.print("Please Enter a number: ");
        int number = sc.nextInt();
        // Check for positive number less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 are:");
            int counter = 100;  // Start from 100
            // Loop while counter is greater than 1
            while (counter > 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }
	}	

}
