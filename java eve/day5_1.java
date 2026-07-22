import java.util.Scanner;

public class day5_1 {
    public static int calculateTotal(int m1,int m2,int m3,int m4,int m5){
        return m1+m2+m3+m4+m5;
    }
    public static double calculatePercentage(int total){
         return ((total* 100.0) /500);
    }

    public static boolean isPassed(double percentage){
        if(percentage>=33){
            return true;
        
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Marks: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        System.out.println("STUDENT RESULT");
        int total = calculateTotal(m1,m2,m3,m4,m5);
        System.out.println("Total: "+total);

        double percentage = calculatePercentage(total);
        System.out.println("Percentage: "+percentage+"%");

        boolean pass = isPassed(percentage);
        if(true){
            System.out.println("Status: PASS");
        }
        else{
            System.out.println("Status: FAIL");
        }
        
    }

}

