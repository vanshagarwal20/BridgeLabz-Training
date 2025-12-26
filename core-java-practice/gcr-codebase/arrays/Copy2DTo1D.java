package arrays;
import java.util.*;
public class Copy2DTo1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
//        rows of input
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
//        column of input
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter elements of the 2D array:");
//        input 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }
//        conversion 
        int[] array = new int[rows * columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }
//        final output
        System.out.println("\n1D Array after copying elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
	}

}
