package basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p025_FibonacciRecursiveMemoizationHashMap {
    static Map<Integer,Long> fibCache = new HashMap<>();
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci series upto: ");
        int input = sc.nextInt();
        long t1 = System.currentTimeMillis();
        for(int i = 0 ; i <= input ; i++){
            System.out.print(" " + fibonacci(i));
        }
        sc.close();
        long t2 = System.currentTimeMillis();
        System.out.println("\n Time taken : " + (t2-t1));
    }

    static long fibonacci(int m){
        if(m<=1){
            return m;
        }
        if(fibCache.containsKey(m)){
            return fibCache.get(m);
        }
        long result = fibonacci(m-1 )   + fibonacci(m-2);
        fibCache.put(m,result);
        return result;
    }

}
