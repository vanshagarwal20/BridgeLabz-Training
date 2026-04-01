package arrays;
import java.util.*;
public class DigitFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int tempNumber = number;
        int digitCount = 0;
//        count the number
        while (tempNumber != 0) {
            digitCount++;
            tempNumber = tempNumber / 10;
        }
        int[] digits = new int[digitCount];
        tempNumber = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNumber % 10;
            tempNumber = tempNumber / 10;
        }
        int[] frequency = new int[10];
        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

	}

}
