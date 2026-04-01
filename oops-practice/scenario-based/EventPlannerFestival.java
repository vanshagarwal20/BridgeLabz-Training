package practice_problems;

import java.util.*;

public class EventPlannerFestival {

	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){

            String email = sc.nextLine();

            if(validate(email)){
                System.out.println("Access Granted");
            } else {
                System.out.println("Access Denied");
            }
        }
    }

    public static boolean validate(String email){

        // Full pattern check
        String regex = "^[a-z]{3,}\\.[a-z]{3,}\\d{4,}@(sales|marketing|IT|product)\\.company\\.com$";

        if(!email.matches(regex)){
            return false;
        }

        return true;
    }
}
