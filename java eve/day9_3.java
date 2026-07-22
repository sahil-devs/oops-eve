import java.util.Scanner;
public class day9_3 

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);

		        char[] key = new char[10];
		        char[] ans = new char[10];
		        int correct = 0, wrong = 0, unattempt = 0;

		        System.out.print("Enter Answer Key: ");
		        for (int i = 0; i < 10; i++)
		            key[i] = sc.next().charAt(0);

		        System.out.print("Enter Student Answers: ");
		        for (int i = 0; i < 10; i++)
		            ans[i] = sc.next().charAt(0);

		        for (int i = 0; i < 10; i++) {
		            if (ans[i] == 'X')
		                unattempt++;
		            else if (ans[i] == key[i])
		                correct++;
		            else
		                wrong++;
		        }

                System.out.println("QUIZ RESULT");

		        System.out.println("Correct Answers: " + correct);
		        System.out.println("Incorrect Answers:  " + wrong);
		        System.out.println("Unattempted:" + unattempt);

		    }
		}
