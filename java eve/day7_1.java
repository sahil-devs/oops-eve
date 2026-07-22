import java.util.Scanner;

public class day7_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] attendance = new int[7];
        int present = 0;

        System.out.print("Attendance for 7 days : ");

        for (int i = 0; i < attendance.length; i++) {
            attendance[i] = sc.nextInt();

            while (attendance[i] != 0 && attendance[i] != 1) {
                System.out.print("Invalid! Enter 0 or 1: ");
                attendance[i] = sc.nextInt();
            }

            if (attendance[i] == 1) {
                present++;
            }
        }

        int absent = attendance.length - present;
        double percentage = (present * 100.0) / attendance.length;

        System.out.println("\nWEEKLY ATTENDANCE");
        System.out.println("Present Days: " + present);
        System.out.println("Absent Days: " + absent);
        System.out.printf("Attendance: %.2f%%%n", percentage);

    }
}