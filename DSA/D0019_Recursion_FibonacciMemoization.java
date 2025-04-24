import java.util.Scanner;

public class D0019_Recursion_FibonacciMemoization {
    private static long [] fibonacciCache;
    public static void main(String [ ] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number upto which you want fi series : ");

        int n = sc.nextInt();
        fibonacciCache = new long [n+1];
        long startTime = System.currentTimeMillis();
        for (int i = 0 ; i <= n ; i++){
            System.out.print(fibonacci(i) + " ");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("\n time taken with memoization : " + (endTime - startTime) );
        sc.close();
    }
    private static long fibonacci(int m )   {
        if (m <= 1){
            return m;
        }
        if (fibonacciCache[m] != 0){
            return fibonacciCache[m] ;
        }
        long fib = fibonacci(m-1) + fibonacci(m-2);
        fibonacciCache[m] = fib;
        return fib;
    }
}
