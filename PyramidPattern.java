package java0919;
import java.util.Scanner;
public class InvertedPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter no.of.rows: ");
		int num=input.nextInt();
		for(int i=1;i<=num;i++) {
			for(int s=1;s<=num-i;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("@ ");
			}
			System.out.println(" ");
		}
		input.close();

	}

}
