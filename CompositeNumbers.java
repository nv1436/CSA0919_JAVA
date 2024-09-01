package java0919;
public class CompositeNumbers {
    
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count > 2; 
    }
    
    public static void main(String[] args) {
        int[] arr = {16, 18, 27, 16, 23, 21, 19};
        int compositeCount = 0;
        
        for (int num : arr) {
            if (isComposite(num)) {
                compositeCount++;
            }
        }
        
        System.out.println("Number of Composite Numbers = " + compositeCount);
    }
}

