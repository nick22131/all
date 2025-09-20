package basics;

import java.util.Scanner;

public class p024_FibonacciRecursive {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci series Upto: ");
        int input = sc.nextInt();
        long t1 = System.currentTimeMillis();
        for(int i = 0 ; i <= input; i++ ){
            System.out.println(" " + fibonacci(i));
        }
        long t2 = System.currentTimeMillis();
        long time = t2 - t1 ;
        System.out.println("Time taken by recursive Fibonacci: " + time);

    }
    static long fibonacci(int m){
        if (m <= 1){
            return m;
        }
        return fibonacci(m-1) + fibonacci(m-2);
    }
}
