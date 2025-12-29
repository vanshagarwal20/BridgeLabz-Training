package extras;

import java.time.*;
import java.util.*;

public class DateArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(sc.next());

        LocalDate result = date.plusDays(7)
                               .plusMonths(1)
                               .plusYears(2)
                               .minusWeeks(3);

        System.out.println("Final Date after operations: " + result);
	}

}
