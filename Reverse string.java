package java0919;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter string: ");
		String name=scanner.nextLine();
		String empty="";
		int len=name.length();
		for(int i=len-1;i>=0;i--)
		{
		 empty=empty+name.charAt(i);
		}
		System.out.print(empty);
		scanner.close();

	}

}
