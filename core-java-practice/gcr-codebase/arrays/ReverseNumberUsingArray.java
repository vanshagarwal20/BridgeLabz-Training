package array;
import java.util.*;
public class ReverseNumberUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int tempNumber = number;
        int digitCount = 0;
//        digit counter
        while (tempNumber != 0) {
            digitCount++;
            tempNumber = tempNumber / 10;
        }
//        arrays
        int[] digits = new int[digitCount];
//        storing
        tempNumber = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNumber % 10;
            tempNumber = tempNumber / 10;
        }
        int[] reversedDigits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[digitCount - 1 - i];
        }
//        output
        System.out.print("Reversed Number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reversedDigits[i]);
        }

	}

}
