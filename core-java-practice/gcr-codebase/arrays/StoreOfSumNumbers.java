package array;
import java.util.*;
public class StoreOfSumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
//		array
		double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        System.out.println("Enter numbers (Enter 0 or negative number to stop):");
//        starting
        while (true) {
            System.out.print("Enter a number: ");
            double input = sc.nextDouble();
            if (input <= 0) {
                break;
            }
            if (index == 10) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }
            numbers[index] = input;
            index++;
        }
//        output
        System.out.println("\nStored Numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        System.out.println("\nTotal Sum = " + total);

	}

}
