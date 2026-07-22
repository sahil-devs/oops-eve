import java.util.Scanner;

public class day10_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("First name: ");
        String first = sc.nextLine().trim();

        System.out.print("Middle name: ");
        String middle = sc.nextLine().trim();

        System.out.print("Last name: ");
        String last = sc.nextLine().trim();

        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
        middle = middle.substring(0, 1).toUpperCase() + middle.substring(1).toLowerCase();
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();

        System.out.println();
        System.out.println("Formatted Name: " + first + " " + middle + " " + last);
        System.out.println("Initial Format: "
                + first.charAt(0) + ". "
                + middle.charAt(0) + ". "
                + last);
        
   
    }
}
