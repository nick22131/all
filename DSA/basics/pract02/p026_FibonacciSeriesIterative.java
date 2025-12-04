package basics.pract02;

import java.util.Scanner;

public class p026_FibonacciSeriesIterative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("fibonacci series upto: ");
        int input = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print("\n fibonacci series : " + a + " " + b);
        long t1 = System.currentTimeMillis();

        for(int i = 2 ; i <= input ; i ++){
            sum = a + b;
            System.out.print(" "+ sum);
            a = b;
            b = sum;
        }

        long t2 = System.currentTimeMillis();
        long time = t2 - t1;
        System.out.print("\n time taken: " + time);
    }
}
