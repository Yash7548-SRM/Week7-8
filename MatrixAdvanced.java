import java.util.Random;

public class MatrixAdvanced {
    public static void main(String[] args) {
        int[][] a2 = createMatrix(2,2);
        int[][] a3 = createMatrix(3,3);
        System.out.println("Matrix 2x2:");
        displayMatrix(a2);
        System.out.println("Transpose 2x2:");
        displayMatrix(transpose(a2));
        System.out.println("Determinant 2x2: " + determinant2x2(a2));
        System.out.println("Inverse 2x2:");
        displayMatrix(inverse2x2(a2));
        System.out.println("Matrix 3x3:");
        displayMatrix(a3);
        System.out.println("Transpose 3x3:");
        displayMatrix(transpose(a3));
        System.out.println("Determinant 3x3: " + determinant3x3(a3));
        System.out.println("Inverse 3x3:");
        displayMatrix(inverse3x3(a3));
    }

    public static int[][] createMatrix(int r,int c) {
        int[][] m = new int[r][c];
        Random rand = new Random();
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++)
                m[i][j]=rand.nextInt(10)+1;
        return m;
    }

    public static int[][] transpose(int[][] m) {
        int r = m.length, c = m[0].length;
        int[][] t = new int[c][r];
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++)
                t[j][i]=m[i][j];
        return t;
    }

    public static int determinant2x2(int[][] m) {
        return m[0][0]*m[1][1]-m[0][1]*m[1][0];
    }

    public static int determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(int[][] m) {
        double det = determinant2x2(m);
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1]/det; inv[0][1] = -m[0][1]/det;
        inv[1][0] = -m[1][0]/det; inv[1][1] = m[0][0]/det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] m) {
        double det = determinant3x3(m);
        double[][] inv = new double[3][3];
        inv[0][0]=(m[1][1]*m[2][2]-m[1][2]*m[2][1])/det;
        inv[0][1]=-(m[0][1]*m[2][2]-m[0][2]*m[2][1])/det;
        inv[0][2]=(m[0][1]*m[1][2]-m[0][2]*m[1][1])/det;
        inv[1][0]=-(m[1][0]*m[2][2]-m[1][2]*m[2][0])/det;
        inv[1][1]=(m[0][0]*m[2][2]-m[0][2]*m[2][0])/det;
        inv[1][2]=-(m[0][0]*m[1][2]-m[0][2]*m[1][0])/det;
        inv[2][0]=(m[1][0]*m[2][1]-m[1][1]*m[2][0])/det;
        inv[2][1]=-(m[0][0]*m[2][1]-m[0][1]*m[2][0])/det;
        inv[2][2]=(m[0][0]*m[1][1]-m[0][1]*m[1][0])/det;
        return inv;
    }

    public static void displayMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] m) {
        for (double[] row : m) {
            for (double val : row) System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }
}