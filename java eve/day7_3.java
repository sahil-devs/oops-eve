import java.util.Scanner;

public class day7_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] expenses = new double[7];

        System.out.print("Enter expenses for 7 days:");
        for (int i = 0; i < 7; i++) {
            expenses[i] = sc.nextDouble();

            while (expenses[i] < 0) {
                System.out.println("Invalid! Expense cannot be negative.");
                expenses[i] = sc.nextDouble();
            }
        }

        System.out.print("Daily budget limit: ");
        double budgetLimit = sc.nextDouble();

        while (budgetLimit <= 0) {
            System.out.println("Invalid! Budget limit must be positive.");
            budgetLimit = sc.nextDouble();
        }

        double totalSpending = 0;
        int daysAboveBudget = 0;

        for (int i = 0; i < 7; i++) {
            totalSpending += expenses[i];

            if (expenses[i] > budgetLimit) {
                daysAboveBudget++;
            }
        }

        double averageSpending = totalSpending / 7;

        System.out.println("\nEXPENSE REPORT");
        System.out.printf("Total Spending: Rs. %.2f%n", totalSpending);
        System.out.printf("Average Daily Spending: Rs. %.2f%n", averageSpending);
        System.out.println("Days Above Budget: " + daysAboveBudget);

        sc.close();
    }
}