package basics.pract;

import java.util.Scanner;

public class p012_SumOfDigits {
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a Number : ");
     int input = sc.nextInt();
     int sum = 0;
     while (input > 0 ){
         int i = input % 10;
         sum = sum + i ;
         input = input / 10 ;
     }
     System.out.print("Sum of Digits of given Number is : " + sum   );
 }
}
