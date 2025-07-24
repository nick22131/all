import java.util.Scanner;

public class p021_FibonacciIterative {
   public static void main(String[] args ){
       Scanner sc = new Scanner(System.in);
       System.out.print("Fibonacci series upto a Number : ");
       long input = sc.nextLong();
       long t1 = System.currentTimeMillis();
       fibonacci(input) ;
       long t2 = System.currentTimeMillis();
       long time = t2 - t1;
       System.out.print("\n time taken for Iterative Fibonacci : " + time);
   }
   static void fibonacci(long input){
       long a = 0 ;
       long b = 1 ;
       for(long i = 2 ; i <= input; i++){
           long c = a + b;
           System.out.print(" " + c);
           a = b;
           b = c;
       }
   }
}
