import java.util.Scanner;

public class day9_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[5][3];

        System.out.println("Marks for 5 students, 3 assessments each:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {

                marks[i][j] = sc.nextInt();

                while (marks[i][j] < 0 || marks[i][j] > 100) {
                    System.out.print("Invalid! Enter again: ");
                    marks[i][j] = sc.nextInt();
                }
            }
        }

        for (int i = 0; i < 5; i++) {

            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            double avg = total / 3.0;

            System.out.printf("Student %d : Total  %d  , Average  %.2f%n",
                    i + 1, total, avg);
        }

        sc.close();
    }
}