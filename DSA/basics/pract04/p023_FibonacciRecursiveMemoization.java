package basics.pract04;

public class p023_FibonacciRecursiveMemoization {
    static int[] fibCache;
    public static void main(String[] args){
        int input = Utility.getNumber();
        fibCache = new int[input+1];
        System.out.print("\n series: ");
        for(int i = 0; i <= input ; i++){
            System.out.print(" " + fibonacci(i));
        }
    }

    static int fibonacci(int m ){
        if(m <= 1){
            return m;
        }
        if(fibCache[m] != 0){
            return fibCache[m];
        }
        int fib = fibonacci(m-1) + fibonacci(m-2);
        fibCache[m] = fib;
        return fib;
    }
}
