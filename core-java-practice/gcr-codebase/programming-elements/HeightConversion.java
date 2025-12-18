package programming_elements;
import java.util.*;
public class HeightConversion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     double heightInCm = sc.nextDouble();
	     double totalHeInches = heightInCm / 2.54;
	     int HeInfeet = (int) (totalHeInches / 12);
	     double inches = totalHeInches % 12;
	     System.out.println("Your Height in cm is " + heightInCm +" while in feet is " + HeInfeet +" and inches is " + inches);
	}

}
