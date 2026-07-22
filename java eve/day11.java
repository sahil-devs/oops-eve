import java.util.Scanner;

public class day11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		display();

		Scanner sc = new Scanner(System.in);
		System.out.println("How many students are their in the class:");
		int n = sc.nextInt();
		
		int[] marks = new int[n];
		
		marks = assign(n);
		event_display();
		
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			int max = max_servant(marks, n);
			System.out.println("max marks" + max);
			break;
		case 2:
			int min = min_sevant(marks, n);
			System.out.println("min marks:" + min);
			break;
		case 3:
			System.out.println("enter the marks which you want to search:");
			int search = sc.nextInt();
			boolean available = search_servant(marks,n,search);
			System.out.println(available);
			break;
		case 4:
			break;
		case 5:
			break;
			default:
				System.out.println("Invalid input");
		}
		
	}


	private static boolean search_servant(int[] marks, int n, int search) {
		// TODO Auto-generated method stub
		for(int i = 0; i < n; i++) {
			if(marks[i] == search ) {
				return true;
			}
		}
			
			
		return false;
	}


	private static int min_sevant(int[] marks, int n) {
		// TODO Auto-generated method stub
		int min = marks[0];
		for(int i = 1; i < n;i++) {
			if(marks[i] < min) {
				min = marks[i];
			}
		}
		return min;
	}

	private static int max_servant(int[] marks, int n) {
		// TODO Auto-generated method stub
		int max = 0;
		for(int i = 0; i < n ; i++) {
			if (marks[i]> max) {
				max = marks[i];
			}
		}
		return max;
	}

	private static void event_display() {
		// TODO Auto-generated method stub
		System.out.println("press 1 for max marks");
		System.out.println("press 2 for min marks");
		System.out.println("press 3 for searching student's marks");
		System.out.println("press 4 for sum of all  marks");
		System.out.println("press 5 for avg of marks");
		
		
		
	}

	

	private static int[] assign(int n) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] mark = new int[n];
		for(int i = 0; i < n ; i ++) {
			System.out.println("Enter mark of student number:" + (i + 1)  );
			mark[i]= sc.nextInt();
		}
		return mark;
	}

	private static void display() {
		// TODO Auto-generated method stub

		System.out.println("*********************************");
		System.out.println("Chitakar university dashboard");
		System.out.println("*********************************");
		
	}

}