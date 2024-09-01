package java0919;
import java.util.Scanner;

public class NegativeFibonacci {

    public static void generateNegativeFibonacci(int n) {
        int[] fib = new int[2 * n + 1];  // To store values for negative and positive indices
        
        fib[n] = 0;
        fib[n + 1] = 1;
        
        for (int i = n + 2; i <= 2 * n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        for (int i = n - 1; i >= 0; i--) {
            fib[i] = fib[i + 2] - fib[i + 1];
        }
        
        System.out.println("Negative Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        generateNegativeFibonacci(n);
        sc.close();
    }
}
