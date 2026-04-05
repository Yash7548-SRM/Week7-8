import java.util.Random;
import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: "); int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }

    public static int[][] generateScores(int n) {
        int[][] arr = new int[n][3];
        Random rand = new Random();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                arr[i][j] = 10 + rand.nextInt(91);
        return arr;
    }

    public static double[][] calculateResults(int[][] arr) {
        double[][] res = new double[arr.length][3];
        for (int i = 0; i < arr.length; i++) {
            int total = arr[i][0]+arr[i][1]+arr[i][2];
            double avg = Math.round((total/3.0)*100.0)/100.0;
            double percent = Math.round((total/300.0*100)*100.0)/100.0;
            res[i][0]=total; res[i][1]=avg; res[i][2]=percent;
        }
        return res;
    }

    public static void displayScorecard(int[][] scores, double[][] res) {
        System.out.println("Physics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++)
            System.out.printf("%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f\n", scores[i][0], scores[i][1], scores[i][2], res[i][0], res[i][1], res[i][2]);
    }
}