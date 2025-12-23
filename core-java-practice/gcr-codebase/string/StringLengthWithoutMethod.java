package string;
import java.util.*;

public class StringLengthWithoutMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        int customLength = findLength(input);
        int builtInLength = input.length();
        System.out.println("Length without using length() method: " + customLength);
        System.out.println("Length using built-in length() method: " + builtInLength);
	}
	public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

}
