package basics.pract02;

import java.util.Scanner;

public class p022_FibonacciRecursive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fibonacci series upto: ");
        int input = sc.nextInt();
        long t1 = System.currentTimeMillis();
        System.out.print("\n fibonacci series : " + fibonacci(input));
        long t2 = System.currentTimeMillis();
        long time = t2 - t1;
        System.out.print("\n time taken : " + time);
    }

    static int  fibonacci(int input){
        if(input <= 1){
            return input ;
        }
        return fibonacci (input - 1 ) + fibonacci (input -2);
    }
}
