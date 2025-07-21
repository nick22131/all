import java.util.Scanner;

public class p026_FibonacciSeries {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Fibonacci Series upto :  " );
         int input = sc.nextInt();
         int a = 0;
         int b = 1;
         int sum = 0;
         System.out.println("Fibonacci series is :  " + a + " "+ b);
         for(int i = 2; i <= input; i++){
             sum = a + b;
             System.out.print(" "  + sum);
             a = b;
             b = sum;
         }
         sc.close();

     }

}
