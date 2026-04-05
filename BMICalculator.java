import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        for(int i = 0; i < 10; i++) {
            double weight = sc.nextDouble();
            double heightCm = sc.nextDouble();
            data[i][0] = weight;
            data[i][1] = heightCm;
            data[i][2] = calculateBMI(weight, heightCm);
            System.out.println("Weight: " + weight + "kg, Height: " + heightCm + "cm, BMI: " + data[i][2] + ", Status: " + bmiStatus(data[i][2]));
        }
    }

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String bmiStatus(double bmi) {
        if(bmi < 18.5) return "Underweight";
        if(bmi < 24.9) return "Normal";
        if(bmi < 29.9) return "Overweight";
        return "Obese";
    }
}