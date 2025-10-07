package basics.pract01;

import java.util.Arrays;
import java.util.Scanner;

public class p033_ArrayBubbleSort {
  public static void main (String [] args ){
      Scanner sc  = new Scanner(System.in);
      System.out.print("Enter Array elements: ");
      String input = sc.nextLine();
      String[] ele = input.split(" ");
      int []  array = new int[ele.length];
      for(int i = 0 ; i < ele.length; i++){
          array[i] = Integer.parseInt(ele[i ]);
      }
      long t1 = System.currentTimeMillis();
      System.out.print("Enterd array is : " + Arrays.toString(array));
      bubbleSort(array);
      System
  }
}
