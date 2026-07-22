import java.util.Scanner;

public class day6_3 {
    public static double calculateBill(int units) {
        double rate = 6.0;   // per unit charge
        return units * rate;
    }

    // Method for Laboratory (units + equipment charge)
    public static double calculateBill(int units, double equipmentCharge) {
        double rate = 6.0;   // per unit charge
        return (units * rate) + equipmentCharge;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Consumer type: ");
        String type = sc.nextLine();

        System.out.print("Units: ");
        int units = sc.nextInt();

        double totalCost;
        double energyCharge;
        double equipmentCharge = 0;

        if (type.equalsIgnoreCase("Laboratory")) {

            System.out.print("Fixed equipment charge: ");
            equipmentCharge = sc.nextDouble();

            energyCharge = calculateBill(units) ;
            totalCost = calculateBill(units, equipmentCharge);

        } else {

            energyCharge = calculateBill(units);
            totalCost = energyCharge;
        }

        System.out.println();
        System.out.println("ELECTRICITY ESTIMATE");
        System.out.println("Type: " + type);
        System.out.printf("Energy Charge: Rs. %.2f%n", energyCharge);
        if (type.equalsIgnoreCase("Laboratory"))
             {
            System.out.printf("Equipment Charge: Rs. %.2f%n", equipmentCharge);
        }

        System.out.printf("Total Cost: Rs. %.2f%n", totalCost);

    }
}