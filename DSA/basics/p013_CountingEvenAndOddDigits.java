package basics;

import java.util.Scanner;

public class p013_CountingEvenAndOddDigits {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Number : ");
      long input = sc.nextLong();
      int countE = 0;
      int countO = 0;
      while(input > 0){
          long rem = input % 10;
          if(rem % 2 == 0 ){
              countE++;
          }else{
              countO++;
          }
          input = input / 10 ;
      }
      System.out.print("Even Count is : " + countE + "  Odd Count is : " + countO);
  }
}
