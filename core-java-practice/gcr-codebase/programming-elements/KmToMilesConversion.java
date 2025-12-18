package programming_elements;
import java.util.*;

public class KmToMilesConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double km;
        Scanner sc = new Scanner(System.in);
        km = sc.nextInt();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
		
		
	}

}
