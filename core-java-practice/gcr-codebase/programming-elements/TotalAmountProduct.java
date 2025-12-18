package programming_elements;
import java.util.*;
public class TotalAmountProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double Price = sc.nextDouble();
        int quantity = sc.nextInt();
        double totalPri = Price * quantity;
        System.out.println("The total purchase price is INR " + totalPri +" if the quantity " + quantity +" and unit price is INR " + Price);
	}

}
