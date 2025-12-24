package method;

public class Calendar {

	public static boolean isLeapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        }
        return false;
    }

    public static int getDays(int month, int year){
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeapYear(year)){
            return 29;
        }
        return days[month - 1];
    }

    public static int getFirstDay(int m, int y){
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31*m0)/12) % 7;
    }

    public static void main(String[] args){
        int month = 7;
        int year = 2005;
        int days = getDays(month, year);
        int first = getFirstDay(month, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < first; i++)
            System.out.print("    ");
        for (int i = 1; i <= days; i++){
            System.out.printf("%3d ", i);
            if ((i + first) % 7 == 0)
                System.out.println();
        }
    }

}
