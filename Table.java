package java0919;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number: ");
		int num=scanner.nextInt();
		for(int i=0;i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		scanner.close();

	}

}
