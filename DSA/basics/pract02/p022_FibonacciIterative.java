package basics.pract02;

import java.util.Scanner;

public class p022_FibonacciIterative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter fibonacci upto: ");
        int input = sc.nextInt();
        long t1 = System.currentTimeMillis();
        fibonacci(input);
        long t2 = System.currentTimeMillis();
        long time = t2 - t1;
        System.out.print("\n Time Taken: " + time   );
    }

    static void fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.print("fibonacci series is : " + a +" " +  b);
        for(int i = 2 ; i <= n ; i++ ){
            int c = a + b;
            System.out.print(" " + c );
            a = b;
            b = c;
        }
    }
}
