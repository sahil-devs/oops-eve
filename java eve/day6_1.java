import java.util.Scanner;

public class day6_1 {
     public static double calculateCharge(double weight) {
        return 50 + (weight * 20);
    }

    // Overloaded Method for Outstation Delivery
    public static double calculateCharge(double weight, double distance) {
        return 50 + (weight * 20) + (distance * 1.458);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Delivery type: ");
        int type = sc.nextInt();

        System.out.print("Weight: ");
        double weight = sc.nextDouble();

        double charge;

        if (type == 1) {
            charge = calculateCharge(weight);

            System.out.println("\nCOURIER CHARGE");
            System.out.println("Delivery: Local");
            System.out.println("Weight: " + weight + " kg");
            System.out.printf("Charge: Rs. %.2f%n", charge);

        } else if (type == 2) {

            System.out.print("Distance: ");
            int distance = sc.nextInt();

            charge = calculateCharge(weight, distance);

            System.out.println("\nCOURIER CHARGE");
            System.out.println("Delivery: Outstation");
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Distance: " + distance + " km");
            System.out.printf("Charge: Rs. %.2f%n", charge);

        } else {
            System.out.println("Invalid Delivery Type");
        }
}
}
