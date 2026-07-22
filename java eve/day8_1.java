import java.util.Scanner;

public class day8_1 {

    static Scanner sc = new Scanner(System.in);

    static void readAttendance(double[] a) {
        System.out.print("Enter attendance:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();

            while (a[i] < 0 || a[i] > 100) {
                System.out.print("Invalid! Enter again: ");
                a[i] = sc.nextDouble();
            }
        }
    }

    static double calculateAverage(double[] a) {
        double sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum / a.length;
    }

    static int countShortage(double[] a, double limit) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < limit) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] attendance = new double[n];

        readAttendance(attendance);

        double avg = calculateAverage(attendance);
        int below = countShortage(attendance, 75);
         System.out.println("CLASS ATTENDANCE");
        System.out.printf("Class Average = %.2f%%\n", avg);
        System.out.println("Students Below 75% = " + below);
    }
}