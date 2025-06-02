/*
0   1   2   3   5
  8  13  21  34 
   55  89 144  
    233 377   
      610 
*/

public class Apat4 {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        int[] fib = new int[n * (n + 1) / 2];
        
        // Generate Fibonacci sequence
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        // Print inverted Fibonacci triangle
        int index = 0;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4d", fib[index]);
                index++;
            }
            System.out.println();
        }
    }
}
