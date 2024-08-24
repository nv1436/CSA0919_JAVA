package java0919;
import java.util.Scanner;
public class Intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter age: ");
		int age=scanner.nextInt();
		System.out.println("enter principle: ");
		int p=scanner.nextInt();
		System.out.println("enter time: ");
		int t=scanner.nextInt();
		if (age>=60) {
			double ROI=12;
			System.out.println("senior citizen");
			System.out.print("intrest: "+ (p*t*ROI)/100);
		}else {
			double ROI=10;
			System.out.print("intrest: "+ (p*t*ROI)/100);
		}
		scanner.close();

	}

}
