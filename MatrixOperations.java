import java.util.Random;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] a = createMatrix(2,2);
        int[][] b = createMatrix(2,2);
        int[][] add = addMatrices(a,b);
        int[][] sub = subtractMatrices(a,b);
        int[][] mul = multiplyMatrices(a,b);
        System.out.println("Matrix A:");
        displayMatrix(a);
        System.out.println("Matrix B:");
        displayMatrix(b);
        System.out.println("Addition:");
        displayMatrix(add);
        System.out.println("Subtraction:");
        displayMatrix(sub);
        System.out.println("Multiplication:");
        displayMatrix(mul);
    }

    public static int[][] createMatrix(int r,int c) {
        int[][] m = new int[r][c];
        Random rand = new Random();
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = rand.nextInt(10);
        return m;
    }

    public static int[][] addMatrices(int[][] a,int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = a[i][j]+b[i][j];
        return res;
    }

    public static int[][] subtractMatrices(int[][] a,int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = a[i][j]-b[i][j];
        return res;
    }

    public static int[][] multiplyMatrices(int[][] a,int[][] b) {
        int r = a.length, c = b[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                for (int k = 0; k < a[0].length; k++)
                    res[i][j] += a[i][k]*b[k][j];
        return res;
    }

    public static void displayMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }
}