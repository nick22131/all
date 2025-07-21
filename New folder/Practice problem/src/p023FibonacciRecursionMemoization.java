import java.util.Scanner;

public class p023FibonacciRecursionMemoization {
      private static long[] fibCache;
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print("Fibonacci Series upto : ");
          int input = sc.nextInt();
          long t1 = System.currentTimeMillis();
          fibCache = new long[input+1 ];
          for(int i = 0 ; i <= input; i++) {
              System.out.println(" " + fibonacci(i));
          }
          long t2 = System.currentTimeMillis();
          long time = t2 - t1 ;
          System.out.print("Time taken by Memoization is : " + time);
      }

      static long fibonacci(int m){
          if( m <= 1 ){
              return m;
          }
          if(fibCache[m] != 0){
              return fibCache[m];
          }

          long fib = fibonacci(m-1)+fibonacci(m-2);
          fibCache[m] = fib;
          return fib;

      }

}
