import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Students: ");
        int n = sc.nextInt();
        int handshakes = calculateHandshakes(n);
        System.out.println("Maximum number of handshakes: " + handshakes);
    }

    public static int calculateHandshakes(int n) {
        return n * (n - 1) / 2;
    }
}