package programming_elements;
import java.util.*;
public class MaximumHandShake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int Student = sc.nextInt();
        int Totalhandshakes = (Student * (Student - 1)) / 2;
        System.out.println("The maximum number of possible handshakes is " + Totalhandshakes);
	}

}
