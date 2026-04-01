package practice_problems;

import java.util.*;
import java.util.regex.*;

public class DynamicTemplateProcessor {
	
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Pattern pattern = Pattern.compile("\\$\\{(\\w+):(.*?)\\}");

        for(int i = 0; i < n; i++){

            String line = sc.nextLine();
            Matcher matcher = pattern.matcher(line);

            StringBuffer result = new StringBuffer();

            while(matcher.find()){

                String type = matcher.group(1);
                String value = matcher.group(2);

                String replacement = process(type, value);

                matcher.appendReplacement(result, replacement);
            }

            matcher.appendTail(result);

            System.out.println(result.toString());
        }
    }

    public static String process(String type, String value){

        try{

            switch(type){

                case "UPPER":
                    return value.toUpperCase();

                case "LOWER":
                    return value.toLowerCase();

                case "DATE":
                    // expected DD-MM-YYYY
                    if(!value.matches("\\d{2}-\\d{2}-\\d{4}"))
                        return "INVALID";

                    String[] d = value.split("-");
                    int day = Integer.parseInt(d[0]);
                    int month = Integer.parseInt(d[1]);
                    int year = Integer.parseInt(d[2]);

                    int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

                    boolean leap = (year%400==0) || (year%4==0 && year%100!=0);
                    if(leap) days[1] = 29;

                    if(month < 1 || month > 12 || day < 1 || day > days[month-1])
                        return "INVALID";

                    return year + "/" + String.format("%02d", month) + "/" + String.format("%02d", day);

                case "REPEAT":
                    // format word,count
                    if(!value.contains(","))
                        return "INVALID";

                    String[] parts = value.split(",");
                    if(parts.length != 2)
                        return "INVALID";

                    String word = parts[0];
                    int count = Integer.parseInt(parts[1]);

                    StringBuilder sb = new StringBuilder();
                    for(int i=0;i<count;i++){
                        sb.append(word);
                    }
                    return sb.toString();

                default:
                    return "INVALID";
            }

        } catch(Exception e){
            return "INVALID";
        }
    }

}
