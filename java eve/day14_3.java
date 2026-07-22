import java.util.Scanner;

class Learner {

    String id;
    String name;
    double courseFee;
    double amountPaid;
    int[] attendance;

    Learner(String id, String name, double courseFee, double amountPaid, int[] attendance) {
        this.id = id;
        this.name = name;
        this.courseFee = courseFee;
        this.amountPaid = amountPaid;
        this.attendance = attendance;
    }

    double pendingFee() {
        return courseFee - amountPaid;
    }

    double attendancePercentage() {

        int present = 0;

        for (int day : attendance)
            if (day == 1)
                present++;

        return (present * 100.0) / attendance.length;
    }

    String eligibility() {
        if (pendingFee() == 0 && attendancePercentage() >= 75)
            return "Eligible";
        else
            return "Not Eligible";
    }

    void display() {
        System.out.println("\nLEARNER REPORT");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Pending Fee: Rs. " + pendingFee());
        System.out.printf("Attendance: %.2f%%\n", attendancePercentage());
        System.out.println("Certificate: " + eligibility());
    }
}

public class day14_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Learner ID: ");
        String id = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Course Fee: ");
        double fee = sc.nextDouble();

        System.out.print("Amount Paid: ");
        double paid = sc.nextDouble();

        int[] attendance = new int[7];

        System.out.println("Enter Attendance (1=Present, 0=Absent):");

        for (int i = 0; i < 7; i++) {
            attendance[i] = sc.nextInt();
        }

        Learner learner = new Learner(id, name, fee, paid, attendance);

        learner.display();

        sc.close();
    }
}