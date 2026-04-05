import java.util.Scanner;

public class TriangularParkRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Side 1: ");
        double a = sc.nextDouble();
        System.out.print("Side 2: ");
        double b = sc.nextDouble();
        System.out.print("Side 3: ");
        double c = sc.nextDouble();
        int rounds = calculateRounds(a, b, c, 5000);
        System.out.println("Number of rounds to complete 5 km: " + rounds);
    }

    public static int calculateRounds(double a, double b, double c, double distance) {
        double perimeter = a + b + c;
        return (int)Math.ceil(distance / perimeter);
    }
}