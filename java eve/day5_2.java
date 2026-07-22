import java.util.Scanner;

public class day5_2 {
    public static double calculateInterest(int principal, int rate, int years) {
        return (principal * rate * years) / 100.0;
    }

        public static double calculateTotalPayable(int principal, double interest) {
        return (principal + interest);
    }

     public static double calculateMonthlyInstallment(double totalPayable, int months) {
        return totalPayable / months;
     }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Principal amount: ");
        int principal= sc.nextInt();

        System.out.print("Annual interest rate: ");
        int annual = sc.nextInt();

        System.out.print("Loan period in years: ");
        int loan = sc.nextInt();

        System.out.print("Number of months: ");
        int months= sc.nextInt();

        double interest = calculateInterest(principal, annual, loan);
        double totalPayable = calculateTotalPayable(principal, interest);
        double monthlyInstallment = calculateMonthlyInstallment(totalPayable, months);

        System.out.println("\nLOAN ESTIMATE");
        System.out.printf("Simple Interest: Rs. %.2f%n", interest);
        System.out.printf("Total Payable: Rs. %.2f%n", totalPayable);
        System.out.printf("Monthly Instalment: Rs. %.2f%n", monthlyInstallment);

        



    }
}
