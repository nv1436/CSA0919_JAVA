package java0919;
import java.util.Scanner;
public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number to be printed: ");
		        int number = scanner.nextInt();
		        System.out.print("Enter the max number of times printed: ");
		        int maxTimes = scanner.nextInt();
		        for (int i = 1; i <= maxTimes; i++) {
		            for (int j = 0; j < i; j++) {
		                System.out.print(number);
		            }
		            System.out.println();
		        }

		        for (int i = maxTimes - 1; i >= 1; i--) {
		            for (int j = 0; j < i; j++) {
		                System.out.print(number);
		            }
		            System.out.println();
		        }

		        scanner.close();
		    }
		}
