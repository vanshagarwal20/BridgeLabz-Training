package control_flow;
import java.util.*;
public class SumOfNaturalNumbersWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n > 0) {  
            // Sum using formula
            int formulaSum = n * (n + 1) / 2;
            // Sum using while loop
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("There is a mismatch in computations.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
	}

}
