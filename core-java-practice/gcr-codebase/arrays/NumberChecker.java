package array;
import java.util.*;
public class NumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		array
        int[] numbers = new int[5];
//        input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Number Analysis ");
//        checking
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            } 
            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } 
            else {
                System.out.println(numbers[i] + " is Zero");
            }
        }
//        comparison
        System.out.println("Comparison of First and Last Number..");
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are Equal");
        } 
        else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is Greater than last element");
        } 
        else {
            System.out.println("First element is Less than last element");
        }

	}

}
