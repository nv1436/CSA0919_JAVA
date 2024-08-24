package java0919;
import java.util.Scanner;
public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=scanner.nextInt();
		int rev = 0;
		int rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num = num/10;
		}
		System.out.println("reversed: "+rev);
		scanner.close();
	}

}
