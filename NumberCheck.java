public class NumberChecker {
    public static void main(String[] args) {
        int number = 121;
        int[] digits = storeDigits(number);
        System.out.println("Reversed digits:");
        int[] rev = reverse(digits);
        for (int d : rev) System.out.print(d + " ");
        System.out.println();
        System.out.println("Is Palindrome: " + isPalindrome(digits));
        System.out.println("Is Duck Number: " + isDuck(number));
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

    public static int countDigits(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    public static int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean isPalindrome(int[] arr) {
        int[] rev = reverse(arr);
        for (int i = 0; i < arr.length; i++) if (arr[i] != rev[i]) return false;
        return true;
    }

    public static boolean isDuck(int n) {
        while (n > 0) {
            if (n % 10 != 0) return true;
            n /= 10;
        }
        return false;
    }
}