import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks = new int[5];
    double attendance;

    Student(int rollNo, String name, int[] marks, double attendance) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    int getTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    double getAverage() {
        return getTotal() / 5.0;
    }

    String getResult() {
        return getAverage() >= 40 ? "PASS" : "FAIL";
    }

    String getAttendanceStatus() {
        return attendance >= 75 ? "Satisfactory" : "Shortage";
    }
}

public class day14_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            int[] marks = new int[5];
            System.out.println("Enter 5 Subject Marks:");
            for (int j = 0; j < 5; j++) {
                marks[j] = sc.nextInt();
            }

            System.out.print("Attendance (%): ");
            double attendance = sc.nextDouble();

            students[i] = new Student(roll, name, marks, attendance);
        }

        System.out.println("\nCLASS REPORT");

        for (Student s : students) {
            System.out.println(
                s.rollNo + " " + s.name +
                " Total: " + s.getTotal() +
                " Average: " + s.getAverage() +
                " Result: " + s.getResult() +
                " Attendance: " + s.getAttendanceStatus()
            );
        }

        sc.close();
    }
}