import java.util.Scanner;

public class day2_2 {
    public static void main(String[] args) {
        
        System.out.print("Basic salary:");
        Scanner sc= new Scanner(System.in);
        double basicSalary = sc.nextDouble();
        System.out.println("SALARY SLIP");
        System.out.println("Basic Salary: Rs.%.2f"+basicSalary);

        double HRA = (basicSalary*20/100);
        System.out.println("HRA (20%): Rs.%.2f"+HRA);

        double DA = (basicSalary*10/100);
        System.out.println("DA (10%): Rs.%.2f"+DA);

        double PF = (basicSalary*12/100);
        System.out.println("PF (12%):Rs.%.2f"+PF);

        double Gross = (basicSalary + HRA + DA);
        System.out.println("Gross Salary: Rs."+Gross);

        double net_salary = (Gross - PF);
        System.out.println("Net Salary: Rs."+net_salary);
    }
}
