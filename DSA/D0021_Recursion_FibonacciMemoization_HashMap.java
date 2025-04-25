import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D0021_Recursion_FibonacciMemoization_HashMap {
    static HashMap<Integer, Integer> cache = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter a number for a series upto: ");
        int n = sc.nextInt();
        System.out.print("fibonacci series up to " + n + "terms (with hash map memoization)");
        long startTime = System.currentTimeMillis();
        for(int i = 0; i <= n; i++){
            System.out.print(fibonacci(i) + " ");
        }
        long endTime = System.currentTimeMillis();
        System.out.print("\n time taken :" + (endTime - startTime));
    }
    private static int fibonacci(int m ){
        if (m <= 1 ){
            return m;
        }
        if(cache.containsKey(m)){
            return cache.get(m);
        }
        int result = fibonacci(m-1) + fibonacci(m-2);
        cache.put(m, result)    ;
        return result;
    }
}
