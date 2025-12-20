package array;
import java.util.*;
public class LargestAndSecondLargestDigitUpdated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//        input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
//        array to initialize
        int maxDigit = 10;
//        for storing
        int[] digits = new int[maxDigit];
//        counter
        int index = 0;
//        storing
        while (number != 0) {
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            digits[index] = number % 10; 
            number = number / 10;         
            index++;
        }
//        for storing
        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
//        answer
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

	}

}
