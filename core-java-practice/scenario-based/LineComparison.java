package scenario_based;

import java.util.*;

public class LineComparison {

	public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        Double lineOneLength = readLine(sc, "Line One");
        Double lineTwoLength = readLine(sc, "Line Two");
        if (lineOneLength.equals(lineTwoLength)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }
        

        int comparisonResult = lineOneLength.compareTo(lineTwoLength);
        if (comparisonResult > 0) {
            System.out.println("Line One is greater than Line Two");
        } else if (comparisonResult < 0) {
            System.out.println("Line One is less than Line Two");
        } else {
            System.out.println("Both lines are exactly the same");
        }
    }

    private static Double readLine(Scanner sc, String lineName) {
        System.out.println("Enter coordinates for " + lineName);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int xDiff = x2 - x1;
        int yDiff = y2 - y1;

        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }


}
