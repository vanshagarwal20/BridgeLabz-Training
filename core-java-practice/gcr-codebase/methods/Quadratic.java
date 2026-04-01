package method;

import java.util.*;

public class Quadratic {

	public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) return new double[0];
        if (delta == 0) return new double[]{ -b / (2 * a) };
        double sqrt = Math.sqrt(delta);
        return new double[]{
            (-b + sqrt) / (2 * a),
            (-b - sqrt) / (2 * a)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println(Arrays.toString(findRoots(a, b, c)));
    }

}
