package practice_problems;

import java.util.*;

public class Key_Generation {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {

            String str = sc.nextLine();

            // Validation
            if(str.length() == 0){
                System.out.println("Invalid Input (empty string)");
                continue;
            }

            if(str.length() < 6){
                System.out.println("Invalid Input (length < 6)");
                continue;
            }

            if(str.contains(" ")){
                System.out.println("Invalid Input (contains space)");
                continue;
            }

            if(str.matches(".*\\d.*")){
                System.out.println("Invalid Input (contains digits)");
                continue;
            }

            if(!str.matches("[a-zA-Z]+")){
                System.out.println("Invalid Input (contains special character)");
                continue;
            }

            // Step 1: lowercase
            str = str.toLowerCase();

            // Step 2: remove even ASCII characters
            StringBuilder temp = new StringBuilder();
            for(char c : str.toCharArray()){
                if((int)c % 2 != 0){
                    temp.append(c);
                }
            }

            // Step 3: reverse
            temp.reverse();

            // Step 4: even index uppercase
            StringBuilder result = new StringBuilder();
            for(int j = 0; j < temp.length(); j++){
                char c = temp.charAt(j);

                if(j % 2 == 0){
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(c);
                }
            }

            System.out.println("The generated key is - " + result.toString());
        }
    }

}
