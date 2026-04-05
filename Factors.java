import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int number = 12;
        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();
        System.out.println("Greatest factor: " + greatestFactor(factors));
        System.out.println("Sum of factors: " + sumFactors(factors));
        System.out.println("Product of factors: " + productFactors(factors));
        System.out.println("Product of cube of factors: " + productCubeFactors(factors));
    }

    public static int[] findFactors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) if (n % i == 0) list.add(i);
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) arr[i] = list.get(i);
        return arr;
    }

    public static int greatestFactor(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    public static int sumFactors(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    public static int productFactors(int[] arr) {
        int p = 1;
        for (int n : arr) p *= n;
        return p;
    }

    public static double productCubeFactors(int[] arr) {
        double p = 1;
        for (int n : arr) p *= Math.pow(n, 3);
        return p;
    }
}