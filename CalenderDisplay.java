import java.util.Scanner;

public class CalendarDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.println(getMonthName(month) + " " + year);
        displayCalendar(month, year);
    }

    public static String getMonthName(int m) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[m-1];
    }

    public static int daysInMonth(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && isLeapYear(y)) return 29;
        return days[m-1];
    }

    public static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    public static int firstDay(int m, int y) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12*((14 - m)/12) - 2;
        return (d + x + (31*m0)/12) % 7;
    }

    public static void displayCalendar(int m, int y) {
        String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        for (String day : days) System.out.print(day + "\t");
        System.out.println();
        int start = firstDay(m,y);
        for (int i = 0; i < start; i++) System.out.print("\t");
        for (int d = 1; d <= daysInMonth(m,y); d++) {
            System.out.printf("%d\t", d);
            if ((d + start) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
}