public class NumberChecker {
    public static void main(String[] args) {
        int number = 153;
        int[] digits = storeDigits(number);
        System.out.println("Number of digits: " + countDigits(number));
        System.out.println("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();
        System.out.println("Is Duck Number: " + isDuck(number));
        System.out.println("Is Armstrong Number: " + isArmstrong(number));
        int[] largest = largestTwo(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);
        int[] smallest = smallestTwo(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
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

    public static boolean isDuck(int n) {
        while (n > 0) {
            if (n % 10 != 0) return true;
            n /= 10;
        }
        return false;
    }

    public static boolean isArmstrong(int n) {
        int[] digits = storeDigits(n);
        int sum = 0;
        int len = digits.length;
        for (int d : digits) sum += Math.pow(d, len);
        return sum == n;
    }

    public static int[] largestTwo(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2) max2 = n;
        }
        return new int[]{max1, max2};
    }

    public static int[] smallestTwo(int[] arr) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) min2 = n;
        }
        return new int[]{min1, min2};
    }
}