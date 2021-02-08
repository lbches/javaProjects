import java.util.*;

class Solution {
    // Multiply 'n' by 'k' using addition:
    private static int nTimesK(int n, int k) {
        // Print current value of n
        System.out.println("n: " + n);

        // Recursive Case
        if(n > 1) { 
            return k + nTimesK(n - 1, k);
        }
        // Base Case n = 1
        else { 
            return k;
        }
    }
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int result = nTimesK(scanner.nextInt(), scanner.nextInt());
        scanner.close();
        System.out.println("Result: " + result);
    }
}
