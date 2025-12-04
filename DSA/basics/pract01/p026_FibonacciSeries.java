package basics.pract01;

import java.util.Scanner;

public class p026_FibonacciSeries {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num fibonacci Series Up to: ");
        int input = sc.nextInt();
        int a = 0 , b = 1, sum = 0;
        System.out.print("Series Fibonacci : " + a + " " + b );
        for (int i = 2 ; i <= input ; i++){
            sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }

    }
}
