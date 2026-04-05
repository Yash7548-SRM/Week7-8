import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        for(int x : arr) {
            if(isPositive(x)) System.out.println(x + " is Positive " + (isEven(x) ? "Even" : "Odd"));
            else System.out.println(x + " is Negative");
        }
        int cmp = compare(arr[0], arr[4]);
        System.out.println("Comparison first vs last: " + (cmp == 1 ? "Greater" : cmp == -1 ? "Less" : "Equal"));
    }

    public static boolean isPositive(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int n1, int n2) { return n1 > n2 ? 1 : n1 < n2 ? -1 : 0; }
}