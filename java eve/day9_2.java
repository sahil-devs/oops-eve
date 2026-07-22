import java.util.Scanner;
public class day9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        Scanner sc = new Scanner(System.in);

		        int[][] units = new int[4][7];
		        int hostelTotal = 0;

		        System.out.println("Units for 4 rooms over 7 days:");

		        for (int i = 0; i < 4; i++) {
		            for (int j = 0; j < 7; j++) {
		                units[i][j] = sc.nextInt();

		                while (units[i][j] < 0) {
		                    System.out.print("Invalid! Enter again: ");
		                    units[i][j] = sc.nextInt();
		                }
		            }
		        }

		        for (int i = 0; i < 4; i++) {

		            int roomTotal = 0;

		            for (int j = 0; j < 7; j++) {
		                roomTotal += units[i][j];
		            }

		            hostelTotal += roomTotal;

		            System.out.println("Room " + (i + 1) +  " Weekly Units: " + roomTotal);
		        }

		        System.out.println("Total Hostel Consumption: " + hostelTotal + " units");

		    }
		}
