import java.util.Scanner;

public class day2_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    System.out.print("Item price: ");
    int price = sc.nextInt();

    System.out.print("Quantity: ");
    int quantity = sc.nextInt();

    System.out.print("Delivery charge: ");
        int charges = sc.nextInt();

    System.out.print("Discount Percentage:");
    int dis_percentage= sc.nextInt();

        System.out.println("ORDER BILL");

    double subtotal = (price*quantity);
    System.out.println("Subtotal: Rs."+subtotal);

    double discount = ((subtotal*dis_percentage)/100);
    System.out.println("Discount: Rs."+discount);

    System.out.println("Delivery Charge: Rs."+charges);

    System.out.println("Final Payable Amount: Rs."+(subtotal-discount+charges));

}
}
