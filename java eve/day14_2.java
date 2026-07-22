import java.util.Scanner;

class Vehicle {
    String number;
    int type;

    Vehicle(String number, int type) {
        this.number = number;
        this.type = type;
    }
}

class ParkingTicket {
    Vehicle vehicle;
    int hours;

    ParkingTicket(Vehicle vehicle, int hours) {
        this.vehicle = vehicle;
        this.hours = hours;
    }

    double calculateFee() {
        if (vehicle.type == 1)
            return 20 * hours;
        else
            return 30 * hours;
    }

    void display() {
        System.out.println("Vehicle Number: " + vehicle.number);
        System.out.println(vehicle.type == 1 ? "Type: Two Wheeler" : "Type: Car");
        System.out.println("Hours: " + hours);
        System.out.println("Fee: Rs. " + calculateFee());
    }
}

public class day14_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Vehicles: ");
        int n = sc.nextInt();

        double revenue = 0;

        for (int i = 0; i < n; i++) {

            sc.nextLine();

            System.out.print("Vehicle Number: ");
            String number = sc.nextLine();

            System.out.print("Type (1=Bike, 2=Car): ");
            int type = sc.nextInt();

            System.out.print("Hours: ");
            int hours = sc.nextInt();

            Vehicle v = new Vehicle(number, type);
            ParkingTicket ticket = new ParkingTicket(v, hours);

            ticket.display();

            revenue += ticket.calculateFee();

            System.out.println();
        }

        System.out.println("Total Revenue = Rs. " + revenue);

        sc.close();
    }
}