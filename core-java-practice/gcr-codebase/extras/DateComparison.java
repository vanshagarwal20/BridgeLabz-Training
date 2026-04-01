package extras;

import java.time.*;
import java.util.*;

public class DateComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(sc.next());

        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(sc.next());

        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE second date");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER second date");
        } else {
            System.out.println("Both dates are SAME");
        }
	}

}
