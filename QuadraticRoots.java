import java.util.Scanner;
import java.util.Arrays;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double[] roots = findRoots(a, b, c);
        System.out.println(Arrays.toString(roots));
    }

    public static double[] findRoots(double a, double b, double c) {
        double delta = b*b - 4*a*c;
        if(delta < 0) return new double[]{};
        if(delta == 0) return new double[]{ -b/(2*a) };
        double sqrt = Math.sqrt(delta);
        return new double[]{ (-b+sqrt)/(2*a), (-b-sqrt)/(2*a) };
    }
}