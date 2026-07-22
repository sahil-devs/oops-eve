import java.util.Scanner;

public class day10_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("EMAIL VALIDATION");

        System.out.print("Email: ");
        String email = sc.nextLine().trim();

        System.out.print("Required domain: ");
        String domain = sc.nextLine().trim();

        int firstAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');

        System.out.println();

        System.out.println("EMAIL VALIDATION");
        System.out.println("Email: " + email);

        if (firstAt > 0 && firstAt == lastAt && email.endsWith(domain)) {
            System.out.println("Status: Valid college email");
        } else {
            System.out.println("Status: Invalid college email");
        }
    }
}
 
