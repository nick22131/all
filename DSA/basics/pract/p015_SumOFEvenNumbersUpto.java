package basics.pract;

import java.util.Scanner;

public class p015_SumOFEvenNumbersUpto {
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print(" Enter a Number: ");
     int input = sc.nextInt();
     int sum = 0;
     for (int i = 1 ; i <= input ; i ++){
        if (input % 2 == 0){
            sum = sum + i;
        }
     }
     System.out.print("Sum of Even Number is : " + sum);
   }
}
