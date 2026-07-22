import java.util.Scanner;

public class day8_2 {

    static Scanner sc = new Scanner(System.in);

    static void readSales(double[] sales) {
        System.out.println("Enter monthly sales:");
        for (int i = 0; i < sales.length; i++) {
            sales[i] = sc.nextDouble();

            while (sales[i] < 0) {
                System.out.print("Invalid! Enter again: ");
                sales[i] = sc.nextDouble();
            }
        }
    }

    static double calculateTotal(double[] sales) {
        double total = 0;

        for (int i = 0; i < sales.length; i++) {
            total += sales[i];
        }

        return total;
    }

    static double calculateAverage(double[] sales) {
        return calculateTotal(sales) / sales.length;
    }

    static int countTargetMonths(double[] sales, double target) {
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        double[] sales = new double[12];

        readSales(sales);

        System.out.print("Enter target: ");
        double target = sc.nextDouble();

        while (target < 0) {
            System.out.print("Invalid! Enter again: ");
            target = sc.nextDouble();
        }

        System.out.println("\nSALES PERFORMANCE");
        System.out.printf("Annual Sales: Rs. %.2f%n", calculateTotal(sales));
        System.out.printf("Average Monthly Sales: Rs. %.2f%n", calculateAverage(sales));
        System.out.println("Months Achieving Target: " + countTargetMonths(sales, target));
    }
}