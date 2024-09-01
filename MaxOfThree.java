package java0919;
public class MaxOfThree {
    public static void main(String[] args) {
        int[] numbers = {1101, 1011, 1001}; 
        int max = numbers[0]; 
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("Maximum Number: " + max);
    }
}
