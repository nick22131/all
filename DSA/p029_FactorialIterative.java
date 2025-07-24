import java.util.Scanner;

public class p029_FactorialIterative {
   public static void main(String[] args )  {
       Scanner sc = new Scanner(System.in);
       System.out.println("Factorial of Num: ");
       int input = sc.nextInt();
       long fact = 1;
       for (int i = 1; i <= input ; i++ ){
           fact = fact * i  ;

       }
       System.out.println("result : " +fact);
   }
}
