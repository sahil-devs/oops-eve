import java.util.Scanner;

public class day2_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Marks in five subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        int totalMarks = m1 + m2 + m3 + m4 + m5;

        double percentage = (totalMarks * 100.0) / 500;

        boolean pass = percentage >= 40;

        
        System.out.println("SEMESTER RESULT");
        System.out.println("Total Marks: " + totalMarks + " / 500");
        System.out.printf("Percentage: %.2f%%\n", percentage);

        if (pass) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
}
}
