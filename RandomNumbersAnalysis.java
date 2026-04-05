import java.util.Arrays;
import java.util.Scanner;

public class RandomNumbersAnalysis {
    public static void main(String[] args) {
        int[] numbers = generate4DigitRandomArray(5);
        System.out.println("Numbers: " + Arrays.toString(numbers));
        double[] stats = findAverageMinMax(numbers);
        System.out.println("Average: " + stats[0] + ", Min: " + stats[1] + ", Max: " + stats[2]);
    }

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) arr[i] = 1000 + (int)(Math.random()*9000);
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0], max = numbers[0];
        for(int x : numbers) {
            sum += x;
            if(x < min) min = x;
            if(x > max) max = x;
        }
        return new double[]{ sum / numbers.length, min, max };
    }
}