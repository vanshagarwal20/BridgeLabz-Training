package arrays;
import java.util.*;
public class MeanHeightOfPlayers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
//		array
        double[] heights = new double[11];
        double sum = 0.0;
//        output
        System.out.println("Enter the height of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = sc.nextDouble();
        }
//        calculations
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
//        fianl answer
        double meanHeight = sum / heights.length;
        System.out.println("Mean Height of the Football Team = " + meanHeight);

	}

}
