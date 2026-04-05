import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumRec = recursiveSum(n);
        int sumFormula = formulaSum(n);
        System.out.println("Sum (recursion): " + sumRec);
        System.out.println("Sum (formula): " + sumFormula);
        System.out.println("Equal: " + (sumRec == sumFormula));
    }

    public static int recursiveSum(int n) {
        if(n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
}