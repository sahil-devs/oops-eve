import java.util.Scanner;

public class day4_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Vehicle Type: ");
        int vehicle = sc.nextInt();

        String vehicleName="";
        if(vehicle==1){
             vehicleName= "two-wheeler";
                }
        if(vehicle==2){
           vehicleName="Car";
        }

        System.err.print("Parking hours: ");
        int hours = sc.nextInt();

        System.out.println("PARKING FEE");
        System.out.println("Vehicle: "+vehicleName);
        System.out.println("Hours: "+hours);


        if(vehicle==1){
            int Fee=50;
            if(hours>1){
            for(int i=1;i<hours;i++){
             Fee=(50+(i*5));
            }
            System.out.println("Fee: Rs."+Fee);
        }
        }
        if(vehicle==2){
            int Fee=20;
            if(hours>1){
            for(int i=1;i<hours;i++){
             Fee=(20+(i*10));
                }
                System.out.println("Fee: Rs."+Fee);
            }
        }

        
        
    }
}
