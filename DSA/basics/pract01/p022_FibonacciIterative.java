package basics.pract01;

import java.util.Scanner;

public class p022_FibonacciIterative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci Num upto: ");
        int input = sc.nextInt();
        long t1 = System.currentTimeMillis();
        fibonacci(input);
        long t2 = System.currentTimeMillis();
        long time = t2 - t1;

        System.out.println(" \n Time taken for fibonacci : " + time );
    }

    static void fibonacci(int n)  {
        int a = 0;
        int b = 1;
        for (int i = 2 ; i <= n; i++){
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c ;
        }
    }
}
