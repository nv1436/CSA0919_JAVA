package java0919;
import java.util.Scanner;

public class EvenorOdd {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=scanner.nextInt();
		if (num % 2 == 0) {
			System.out.print("is even");
		}else {
			System.out.print("is odd");
		}
		scanner.close();

	}

}
