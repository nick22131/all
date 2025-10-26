package basics.pract03;

public class p022_FibonacciRecursiveMemoization {

    private static int [] fibCache;

    public static void main(String[] args){
        int input = Utility.getNumber();
        fibCache = new int[input];
        System.out.print("\n fibonacci series : ");
        System.out.println();
        for (int i = 0; i < input ; i++) {
            System.out.print(" " + fibonacci(i));
        }
    }

    static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        if(fibCache[n] != 0){
            return fibCache[n];
        }
        int fib = fibonacci(n-1 ) + fibonacci(n-2);
        fibCache[n] = fib;
        return fib;
    }
}
