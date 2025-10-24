package basics.pract02;

import java.util.Scanner;

public class p024_FibonacciRecursionMemoization {

    private static int[] fibCache;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci serise upto: ");
        int input = sc.nextInt();
        fibCache = new int[input + 1 ];
        System.out.println();
        long t1 = System.currentTimeMillis();
        for(int i = 0 ; i <= input ; i++){
            System.out.print(" " + fibonacci(i));
        }
        long t2 = System.currentTimeMillis();
        long time = t2 - t1;
        System.out.print("\n time taken: "+ time);
    }

    static int fibonacci(int m){
        if(m <= 1){
            return m;
        }

        if(fibCache[m] != 0){
            return fibCache[m]  ;
        }

        int fib = fibonacci(m -1 ) + fibonacci(m - 2);
        fibCache[m] = fib;
        return fib;
    }
}
