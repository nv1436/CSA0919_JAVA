package java0919;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number a: ");
		int num1=scanner.nextInt();
		System.out.println("enter a number b: ");
		int num2=scanner.nextInt();
		int sum=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		int div=num1/num2;
		System.out.println("addition :"+sum);
		System.out.println("subtraction :"+sub);
		System.out.println("multiply :"+mul);
		System.out.println("division :"+div);
		scanner.close();
	}

}
