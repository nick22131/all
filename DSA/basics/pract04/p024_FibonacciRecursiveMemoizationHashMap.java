package basics.pract04;

import java.util.HashMap;
import java.util.Map;

public class p024_FibonacciRecursiveMemoizationHashMap {
    static Map<Integer,Integer> fibCache = new HashMap<>();

    public static void main(String[] args ){
        int input = Utility.getNumber();
        System.out.print("\n series: ");

        for(int i = 0; i<= input ; i++){
            System.out.print(" " + fibonacci(i));
        }
    }
    static int fibonacci(int n ){
        if(n <= 1){
            return n;
        }
        if(fibCache.containsKey(n)){
            return fibCache.get(n);
        }

        int fib = fibonacci(n-1) + fibonacci(n-2);
        fibCache.put(n,fib);
        return fib;
    }
}
