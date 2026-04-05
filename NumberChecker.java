public class NumberChecker {
    public static void main(String[] args) {
        int number = 21;
        int[] digits = storeDigits(number);
        System.out.println("Number of digits: " + countDigits(number));
        System.out.println("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();
        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squares of digits: " + sumSquares(digits));
        System.out.println("Is Harshad number: " + isHarshad(number, digits));
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < freq.length; i++) {
            System.out.println(freq[i][0] + " : " + freq[i][1]);
        }
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int n) {
        int len = countDigits(n);
        int[] arr = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;
        }
        return arr;
    }

    public static int sumDigits(int[] arr) {
        int sum = 0;
        for (int d : arr) sum += d;
        return sum;
    }

    public static int sumSquares(int[] arr) {
        int sum = 0;
        for (int d : arr) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int n, int[] digits) {
        return n % sumDigits(digits) == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }
}