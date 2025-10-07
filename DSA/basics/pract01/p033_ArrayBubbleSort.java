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
      System.out.print("\n Enterd array is : " + Arrays.toString(array));
      bubbleSort(array);
      System.out.print("\n sorted array is : "  + Arrays.toString(array));
      long t2 = System.currentTimeMillis();
      long time = t2 - t1 ;
      System.out.print("\n time taken : " + time);
  }

  static void bubbleSort(int[] array)   {
      int size = array.length;
      int temp = 0;
      for(int i = 0 ; i < size ; i++){
          for(int j = 0 ; j < size - i -1 ; j++){
              if(array[j] > array[j+1]) {
                  temp = array[j];
                  array[j] = array[j+1];
                  array[j+1] = temp;
              }
          }
      }
  }
}
