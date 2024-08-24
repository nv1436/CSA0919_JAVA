package java0919;
import java.util.Scanner;
public class Voter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter age: ");
		int age=scanner.nextInt();
		if (age>=18) {
			System.out.print("you are eligible to vote");
		}else {
			System.out.print("you are not eligible"+ "," +"eligible after "+ (18-age) + "years");
		}
		scanner.close();

	}

}
