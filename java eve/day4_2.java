import java.util.Scanner;

public class day4_2 {
    public static void displayGrade(int percentage,int attendance){
        if((percentage>90) && (attendance>=85)){
            System.out.println("Eligible");
        }
        if((85<=percentage) && (percentage<100)){
            System.out.println("Grade: A");
        }
        if((75<=percentage) && (percentage<85)){
            System.out.println("Grade: B");
        }
        if((65<=percentage) && (percentage<75)){
            System.out.println("Grade: C");
        }
        if((40<=percentage) && (percentage<75)){
            System.out.println("Grade: D");
        }
        if(percentage<40){
            System.out.println("Grade: F");
        }
    }

    public static void scholarshipStatus(int percentage,int attendance){
        if((attendance>85)&&(percentage>85)){
            System.out.println("Scholarship: Eligible");
        }
        else{
            System.out.println("Scholarship: Not Eligible");
        }
    }

    public static void validation(int percentage,int attendance){
        if((attendance>=0 && 100>=attendance)&& (percentage >= 0 && percentage <= 100)){
            System.out.println("Validation: Input accepted");
        }
        else{
            System.out.println("Validation: Input Not Accepted");
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Percentage: ");
        int percentage = sc.nextInt();

        System.out.print("Attendance: ");
        int attendance = sc.nextInt();

        System.out.println("ACADEMIC DECISION");
        displayGrade(percentage,attendance);

        scholarshipStatus(percentage,attendance);

        validation(percentage,attendance);






        

         


    }
}
