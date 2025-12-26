package array;
import java.util.*;
public class YoungestAndTallestFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		names array
        String[] friends = {"Amar", "Akbar", "Anthony"};
//        arrays
        int[] age = new int[3];
        double[] height = new double[3];
//        input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + friends[i]);
            System.out.print("Age: ");
            age[i] = sc.nextInt();
            System.out.print("Height (in cm): ");
            height[i] = sc.nextDouble();
        }
//        for calculations
        int youngestIndex = 0;
        int tallestIndex = 0;
//        iterations
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }
//        answer
        System.out.println("Result...");
        System.out.println("Youngest Friend: " + friends[youngestIndex] +" (Age: " + age[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + friends[tallestIndex] +"(Height: " + height[tallestIndex] + " cm)");

	}

}
