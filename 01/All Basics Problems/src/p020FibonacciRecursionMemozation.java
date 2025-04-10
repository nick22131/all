import java.util.Scanner;

public class p020FibonacciRecursionMemozation {
    private static long[] fibonaccicache;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
       fibonaccicache = new long[n+1];
       for(int i = 0; i <= n ; i++){
           System.out.print(fibonacci(i)+" ");
       }
    }
    public static long fibonacci(int m) {
        if (m <= 1) {
            return m;
        }
        if (fibonaccicache[m] != 0) {
            return fibonaccicache[m];
        }
        long fib = fibonacci(m - 1) + fibonacci(m - 2);
        fibonaccicache[m] = fib;
        return fib;
    }
}
