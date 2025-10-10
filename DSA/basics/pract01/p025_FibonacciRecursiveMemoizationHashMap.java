package basics.pract01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p025_FibonacciRecursiveMemoizationHashMap {
    static Map<Integer,Integer> cache = new HashMap<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Series upto : ");
        int input = sc.nextInt();
        long t1 = System.currentTimeMillis();
        System.out.print("series: ");
        for(int i = 0; i <= input ; i++){
            System.out.print(" " + fibonacci(i) );
        }
        long t2 = System.currentTimeMillis();
        long time =  t2 - t1;
        System.out.print("\nTime taken : " + time);
    }
    static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        if(cache.containsKey(n)){
            return cache.get(n);
        }

        int fib = fibonacci(n-1 ) + fibonacci(n-2);
        cache.put(n,fib);
        return fib;

    }
}
