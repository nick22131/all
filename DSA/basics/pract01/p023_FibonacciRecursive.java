package basics.pract01;

import java.util.Scanner;

public class p023_FibonacciRecursive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci series Upto: ");
        int input = sc.nextInt();
        long t1 = System.currentTimeMillis();
        System.out.print(" Series:  " );
        for (int i = 0; i <= input ; i++) {

            System.out.print(" " + fibonacci(i));

        }

        long t2 = System.currentTimeMillis();
        long time = t2 - t1;
        System.out.print("\n time taken : " + time )    ;

    }
    static int fibonacci(int n){
        if(n <= 1){
            return n;

        }
        return fibonacci(n-1 ) + fibonacci(n-2);
    }
}
