package java0919;
import java.util.Scanner;
public class NumberPattern {
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
    	System.out.print("enter number: ");
        int num = input.nextInt();
        
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) { 
                System.out.print((num * num) + " ");
                num++;
            }
            System.out.println();
        }
        input.close();
    }
}
