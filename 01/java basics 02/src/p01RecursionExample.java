import java.util.Scanner;

public class p01RecursionExample {
 public static void main(String[] args){
     System.out.print(" enter no for factorial: ");
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     System.out.print("\n Factorial of " + n +" : " + factorial(n));
 }

    public static int factorial(int n ){
     if (n == 0){
         return 1 ;
     }
     else {
         return n * factorial(n - 1 );

     }
 }
}


