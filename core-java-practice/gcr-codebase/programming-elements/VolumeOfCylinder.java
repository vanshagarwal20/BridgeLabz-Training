package programming_elements;
import java.util.*;
public class VolumeOfCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height ");
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder = " + volume);
	}	

}
