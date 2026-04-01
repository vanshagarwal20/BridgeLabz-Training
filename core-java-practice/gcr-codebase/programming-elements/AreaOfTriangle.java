package programming_elements;
import java.util.*;
public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaInches = 0.5 * base * height;
        double areaCm = areaInches*2.54*2.54;
        System.out.println("The area of the triangle in square inches is " + areaInches +" and in square centimeters is " + areaCm);
	}

}
