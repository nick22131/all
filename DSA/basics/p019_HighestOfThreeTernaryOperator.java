package basics;

import java.util.Scanner;

public class p019_HighestOfThreeTernaryOperator {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Three Numbers : ");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       // Ternary operator m = true / false ? (true) a : (false)b
       int m = (a>b ? a:b) > c ? (a>b?a:b) : c;
       System.out.print("Max is : " + m );

   }
}
