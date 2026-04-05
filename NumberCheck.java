import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int result = checkNumber(n);
        System.out.println(result == 1 ? "Positive" : result == -1 ? "Negative" : "Zero");
    }

    public static int checkNumber(int n) {
        return n > 0 ? 1 : n < 0 ? -1 : 0;
    }
}