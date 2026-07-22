import java.util.Scanner;

public class day3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Content Rating: ");
        int con_rate= sc.nextInt();

        System.out.print("Explanation rating: ");
        int expla_rate= sc.nextInt();

        System.out.print("Practical rating: ");
        int practical_rate = sc.nextInt();

        System.out.println("TRAINING FEEDBACK");
        System.out.println("Content: "+con_rate+"/5");
        System.out.println("Explanation: "+expla_rate+"/5");
        System.out.println("Practical Work: "+practical_rate+"/5");

        float avg_rate = (con_rate + expla_rate + practical_rate) / 3.0f;
System.out.printf("Average Rating: %.2f/5%n", avg_rate);
    }
}