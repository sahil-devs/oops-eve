import java.util.Scanner;

public class day10_2 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Feedback: ");
        String feedback = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        int others = 0;

        for (int i = 0; i < feedback.length(); i++) {

            char ch = feedback.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            else if (ch == ' ') {
                spaces++;
            }
            else {
                others++;
            }
        }

        System.out.println();
        System.out.println("TEXT ANALYSIS");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Other Symbols: " + others);

    }
}

