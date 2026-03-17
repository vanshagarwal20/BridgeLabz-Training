package practice_problems;

import java.util.*;


public class GlobalShipmentManifestValidator {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			String word = sc.next();
			if(Validate(word)) {
				System.out.println();
				System.out.println("COMPLIANT RECORD");
			}
			else {
				System.out.println("NON-COMPLIANT RECORD");
			}
		}		
	}
	
	public static boolean Validate(String word) {
		String[] parts = word.split("\\|");
		String name = parts[0];
		if(!name.matches("SHIP-[1-9][0-9]{5}")) {
			return false;
		}
		
		int count = 1;
		String digit = name.substring(5);
		for(int i=1;i<digit.length();i++) {
			if(digit.charAt(i) == digit.charAt(i-1)) {
				count++;
				if(count>3) {
					return false;
				}
			}
			else {
				count = 1;
			}
		}		
		
		String dates = parts[1];
		int [] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(!dates.matches("20[0-9]{2}-\\d{2}-\\d{2}")) {
			return false;
		}
		int day = Integer.parseInt(dates.substring(8,10));
		int month = Integer.parseInt(dates.substring(5,7));
		int year = Integer.parseInt(dates.substring(0,4));
		if(year < 2000 || year > 2099){
		    return false;
		}

		if(month < 1 || month > 12){
		    return false;
		}

		boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

		if(leap){
		    days[1] = 29;
		}

		if(day < 1 || day > days[month-1]){
		    return false;
		}
		
		
		HashSet<String> modes = new HashSet<>(Arrays.asList(
				"AIR","SEA","ROAD","RAIL","EXPRESS","FREIGHT"));
		String mode = parts[2]; 
		if(!modes.contains(mode)) {
			return false;
		}
		
		String weight = parts[3];

		if(!weight.matches("(0|[1-9][0-9]{0,5})(\\.[0-9]{1,2})?")){
		    return false;
		}

		double w = Double.parseDouble(weight);

		if(w <= 0 || w > 999999.99){
		    return false;
		}
		
		String status = parts[4];
		HashSet<String> delivery = new HashSet<>(
				Arrays.asList("DELIVERED","CANCELLED","IN_TRANSIT"));
		
		return delivery.contains(status);		
	}
	

}
