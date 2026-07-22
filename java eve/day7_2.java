import java.util.Scanner;

public class day7_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        System.out.print("Marks: ");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();

            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid! Enter again: ");
                marks[i] = sc.nextInt();
            }
        }

        int total = 0;
        int passed = 0;
        int failed = 0;

        for (int i = 0; i < 5; i++) {
            total += marks[i];

            if (marks[i] >= 33) {
                passed++;
            } else {
                failed++;
            }
        }

        double average = total / 5.0;

        System.out.println("\nMARKS DASHBOARD");
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Marks: %.2f%n", average);
        System.out.println("Passed Subjects: " + passed);
        System.out.println("Failed Subjects: " + failed);


    }
}