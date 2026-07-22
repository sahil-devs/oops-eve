import java.util.Scanner;

public class day3_2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Item name: ");
        String item = sc.nextLine();

        System.out.print("Unit price: ");
        int unit = sc.nextInt();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("GST rate: ");
        int rate = sc.nextInt();

        System.out.println("CAFETERIA RECEIPT");
        System.out.println("Item: "+item);

        double subtotal = (unit*quantity);
        System.out.println("Subtotal: Rs."+subtotal);

        double GST = (subtotal/20);
        System.out.println("GST: Rs."+GST);

        double total = subtotal+GST;
        System.out.println("Grand Total: Rs."+total);
    }
}
