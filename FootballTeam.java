import java.util.Random;

public class FootballTeam {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }
        System.out.println("Heights of players:");
        for (int h : heights) System.out.print(h + " ");
        System.out.println();
        System.out.println("Sum of heights: " + sum(heights));
        System.out.println("Mean height: " + mean(heights));
        System.out.println("Shortest height: " + shortest(heights));
        System.out.println("Tallest height: " + tallest(heights));
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int n : arr) s += n;
        return s;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        return min;
    }

    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }
}