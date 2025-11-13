package basics.pract05;

public class p023_FibonacciRecursiveMemoization {
    private static int [] fibCache;
    public static void main(String[] args){
        int input = Utility.getNum();
        fibCache = new int[input + 1];
        System.out.print("\n fibonacci series: "    );
        for(int i = 0; i <= input; i++){
            System.out.print(" " + fibonacci(i));
        }
        System.out.print("\n <<<<<<<<<<<<>>>>>>>>>>");
    }

    private static int fibonacci(int n){
        if(n <= 1 ){
            return n;
        }
        if(fibCache[n] != 0 ){
            return fibCache[n];
        }

        int fib = fibonacci(n-1) + fibonacci(n-2);
        fibCache[n] = fib;
        return fib;
    }

}
