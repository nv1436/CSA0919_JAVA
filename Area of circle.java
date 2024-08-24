package java0919;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter radius: ");
		int r=scanner.nextInt();
		double area=3.14*r*r;
		System.out.println("AREA: "+area);
		scanner.close();
		
	}

}
