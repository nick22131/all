package basics;

import java.util.Scanner;

public class p014_EvenOrOddNumberCountingUntilNumber {
  public static void main(String[] args )   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Number until to \n find out how many even or odd numbers : ");
      long input = sc.nextLong();
      long OCount = 0;
      long ECount = 0;
      for (long i = 1 ; i <= input ; i++){
          if(i % 2 == 0){
              ECount ++;

          }else{
              OCount ++;
          }
      }
      System.out.print("Even Numbers : " + ECount + " \n Odd Numbers : " + OCount );
  }

}
