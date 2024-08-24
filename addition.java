package java0919;

import java.util.Scanner;

class Addition{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter number a : ");
int a=scanner.nextInt();
System.out.println("enter number b :");
int b=scanner.nextInt();
int c=a+b;
System.out.println("sum :"+c);
scanner.close();
}
}
