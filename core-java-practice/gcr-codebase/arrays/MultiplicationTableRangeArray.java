package arrays;
import java.util.*;
public class MultiplicationTableRangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
//        array for table
        int[] multiplicationResult = new int[4];
        int index = 0;
//        calculations
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[index] = number * i;
            index++;
        }
//        output
        System.out.println("Multiplication Table of " + number + " (from 6 to 9):");
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
	}

}
