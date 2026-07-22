import java.util.Scanner;

public class day3_1 {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);

    System.out.print("Name:");
    String name= sc.nextLine();

    System.out.print("Roll Number: ");
    int roll_num= sc.nextInt();
    sc.nextLine();
    
    System.out.print("Programme:");
    String program= sc.nextLine();

    System.out.print("Semester:");
    int sem = sc.nextInt();
    sc.nextLine();

    System.out.print("Email:");
    String email = sc.nextLine();

    System.out.print("City:");
    String city = sc.nextLine();

    System.out.println("ADMISSION PROFILE");
     System.out.println("Name:"+name);
     System.out.println("Roll Number: "+roll_num);
     System.out.println("Programme:"+program);
     System.out.println("Semester:"+sem);
     System.out.println("Email:"+email);
     System.out.println("City:"+city);
        sc.close();
    }
}
