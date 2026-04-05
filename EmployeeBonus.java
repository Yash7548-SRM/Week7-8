import java.util.Random;

public class EmployeeBonus {
    public static void main(String[] args) {
        double[][] data = new double[10][2];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + rand.nextInt(90000);
            data[i][1] = rand.nextInt(11);
        }
        double[][] updated = calculateBonus(data);
        displaySummary(data, updated);
    }

    public static double[][] calculateBonus(double[][] arr) {
        double[][] res = new double[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            double bonus = arr[i][1] > 5 ? arr[i][0]*0.05 : arr[i][0]*0.02;
            res[i][0] = arr[i][0]+bonus;
            res[i][1] = bonus;
        }
        return res;
    }

    public static void displaySummary(double[][] oldArr, double[][] newArr) {
        double sumOld=0, sumNew=0, totalBonus=0;
        System.out.println("OldSalary\tYears\tNewSalary\tBonus");
        for (int i = 0; i < oldArr.length; i++) {
            System.out.printf("%.0f\t\t%.0f\t%.2f\t\t%.2f\n", oldArr[i][0], oldArr[i][1], newArr[i][0], newArr[i][1]);
            sumOld += oldArr[i][0];
            sumNew += newArr[i][0];
            totalBonus += newArr[i][1];
        }
        System.out.printf("Total\t\t\t%.2f\t\t%.2f\n", sumNew, totalBonus);
    }
}