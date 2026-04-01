package method;

public class TrigonometricFunctions {

	public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        return new double[]{
                Math.sin(rad),
                Math.cos(rad),
                Math.tan(rad)
        };
    }

    public static void main(String[] args) {
        double[] result = calculateTrigonometricFunctions(45);
        System.out.println("Sin: " + result[0]);
        System.out.println("Cos: " + result[1]);
        System.out.println("Tan: " + result[2]);
    }

}
