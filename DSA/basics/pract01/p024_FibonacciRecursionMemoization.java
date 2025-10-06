package basics.pract01;

import java.util.Scanner;

public class p024_FibonacciRecursionMemoization {

    private static int[] fibCache;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter series up to : ");
        int input = sc.nextInt();
        long t1 = System.currentTimeMillis();
        fibCache = new int[input + 1] ;
        fibCache[0] = 0;
        fibCache[1] = 1;
        System.out.print("Series : ");
        for (int i = 0 ; i <= input ; i ++){
            System.out.print(" " + fibonacci(i));
        }
        sc.close();
        long t2 = System.currentTimeMillis();
        long time = t2 - t1 ;

        System.out.print("\ntime taken : " + time );

    }


    static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        if(fibCache[n] != 0){
            return fibCache[n];
        }
        int fib = fibonacci(n- 1) + fibonacci(n-2);
        fibCache[n] = fib;
        return fib;
    }

}
