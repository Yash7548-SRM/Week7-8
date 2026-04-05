import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + result[0] + ", Cosine: " + result[1] + ", Tangent: " + result[2]);
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        return new double[]{Math.sin(rad), Math.cos(rad), Math.tan(rad)};
    }
}