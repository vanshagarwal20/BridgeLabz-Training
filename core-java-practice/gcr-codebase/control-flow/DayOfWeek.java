package control_flow;
import java.util.*;
public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length < 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }
        int m = Integer.parseInt(args[0]); // month
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year
//        Calculate y0
        int y0 = y - (14 - m) / 12;
//        Calculate x
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
//        Calculate m0
        int m0 = m + 12 * ((14 - m) / 12) - 2;
//        Calculate d0 (day of the week)
        int d0 = (d + x + (31 * m0) / 12) % 7;
//        Print day of the week
        System.out.println("Day of the week: " + d0);
        System.out.println("0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday");
	}		

}
