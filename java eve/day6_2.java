import java.util.Scanner;

public class day6_2 {
    public static double area(double side) {
        return side * side;
    }

    
    public static double area(double length, double width) {
        return length * width;
    }

  
    public static double area(int radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Choice: ");
        String choice = sc.next();

        double result;

        if (choice.equalsIgnoreCase("Square")) {

            System.out.print("Side: ");
            double side = sc.nextDouble();

            result = area(side);

            System.out.println("\nAREA RESULT");
            System.out.println("Shape: Square");
            System.out.printf("Area: %.2f square units%n", result);

        } else if (choice.equalsIgnoreCase("Rectangle")) {

            System.out.print("Length: ");
            double length = sc.nextDouble();

            System.out.print("Width: ");
            double width = sc.nextDouble();

            result = area(length, width);

            System.out.println("\nAREA RESULT");
            System.out.println("Shape: Rectangle");
            System.out.printf("Area: %.2f square units%n", result);

        } else if (choice.equalsIgnoreCase("Circle")) {

            System.out.print("Radius: ");
            int radius = sc.nextInt();

            result = area(radius);

            System.out.println("\nAREA RESULT");
            System.out.println("Shape: Circle");
            System.out.printf("Area: %.2f square units%n", result);

        } else {
            System.out.println("Invalid Choice");
        }
    }
}
