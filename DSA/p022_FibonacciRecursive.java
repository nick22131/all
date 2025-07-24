import java.util.Scanner;

public class p022_FibonacciRecursive {
   public static void main(String[] args )  {
       Scanner sc = new Scanner(System.in);
       System.out.print("Fibonacci series upto: ");
       long input = sc.nextLong();
       long t1 = System.currentTimeMillis();
       System.out.println(fibonacci(input));
       long t2 = System.currentTimeMillis();
       long time = t2 - t1 ;
       System.out.println("Time taken by recursive Fibonacci : " + time  );
   }
   static long fibonacci(long m ){
       if (m <= 1 ){
           return m;
       }
       return fibonacci(m -1 ) + fibonacci(m - 2)  ;
   }
}
