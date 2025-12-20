package array;
import java.util.*;
public class LargestAndSecondLargestDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
//        maximum condition
        int maxDigit = 10;
//        array for storing
        int[] digits = new int[maxDigit];
//        counter
        int index = 0;
//        storing
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10; 
            number = number / 10;        
            index++;
        }
//        variables
        int largest = 0;
        int secondLargest = 0;
//        iterating
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
//        output
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

	}

}
