package java0919;
import java.util.Scanner;
public class Studentmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("maths: ");
		int m=scanner.nextInt();
		System.out.println("physics: ");
		int p=scanner.nextInt();
		System.out.println("chemistry: ");
		int c=scanner.nextInt();
		int total=m+p+c;
		int average=total/3;
		double percentage=(total/(double)(3*100))*100;
		System.out.println("total: "+total);
		System.out.println("average: "+average);
		System.out.println("percentage: "+percentage+"%");
		scanner.close();

	}

}
