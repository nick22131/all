package basics.pract02;

import java.util.Scanner;

public class p023_FibonacciRecursiveSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("fibonacci series upto : ");

        int input = sc.nextInt();
        System.out.println();
        long t1 = System.currentTimeMillis();
        for(int i = 0 ; i <= input ; i ++){
            System.out.print(" " + fibonacci(i));
        }
        long t2 = System.currentTimeMillis();
        long time = t2 - t1;
        System.out.print("\n time taken : " + time);
    }

    static int fibonacci(int input ){
        if(input <= 1){
            return input;
        }

        return fibonacci(input -1 ) + fibonacci(input - 2);
    }
}
