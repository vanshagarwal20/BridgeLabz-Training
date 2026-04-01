package programming_elements;
import java.util.*;
public class YardsMilesConvertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double distFeet = sc.nextDouble();
        double yards = distFeet / 3;
        double miles = yards / 1760;
        System.out.println("The distance in feet is " + distFeet +" while in yards is " + yards +" and miles is " + miles);
	}

}
