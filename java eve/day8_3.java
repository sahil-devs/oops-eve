import java.util.Scanner;

public class day8_3 {

    static Scanner sc = new Scanner(System.in);

    static double[] addTax(double[] price, double tax) {

        double[] newPrice = new double[price.length];

        for (int i = 0; i < price.length; i++) {
            newPrice[i] = price[i] + (price[i] * tax / 100);
        }

        return newPrice;
    }

    public static void main(String[] args) {

        System.out.print("Number of items: ");
        int n = sc.nextInt();

        double[] price = new double[n];

        System.out.print("Prices: ");

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextDouble();

            while (price[i] < 0) {
                System.out.print("Invalid! Enter again: ");
                price[i] = sc.nextDouble();
            }
        }

        System.out.print("GST Percentage: ");
        double gst = sc.nextDouble();

        double[] newPrice = addTax(price, gst);

        System.out.print("ORIGINAL PRICES: ");
        for (int i = 0; i < n; i++) {
            System.out.print(price[i] + " ");
        }

        System.out.print("\nGST-ADJUSTED PRICES: ");
        for (int i = 0; i < n; i++) {
            System.out.print(newPrice[i] + " ");
        }

    }
}