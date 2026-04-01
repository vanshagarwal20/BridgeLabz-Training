package functional_interfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//	 Interface with static method
	interface DateUtil {
	
	    static String formatDate(LocalDate date, String pattern) {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
	        return date.format(formatter);
	    }
	}
	
//	 Main class
	public class DateFormatMain {
	    public static void main(String[] args) {
	
	        LocalDate today = LocalDate.now();
	
	        System.out.println("DD-MM-YYYY: " +
	                DateUtil.formatDate(today, "dd-MM-yyyy"));
	
	        System.out.println("YYYY/MM/DD: " +
	                DateUtil.formatDate(today, "yyyy/MM/dd"));
	    }
	}

