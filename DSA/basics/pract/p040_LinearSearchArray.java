package basics.pract;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p040_LinearSearchArray {
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Size Elements: ");
          int size = sc.nextInt();
          int[] array = new int[size] ;
          Random ran = new Random();
          for(int i = 0; i < size; i++){
              array[i] = ran.nextInt(1000);
          }
          System.out.print("\nArray is : " + Arrays.toString(array));
          System.out.print("\n Enter Number to find index: ");
          int value =  sc.nextInt();
          long t1 = System.currentTimeMillis();
          int index = linearSearch(value,array);
          if(index != -1){
              System.out.print("\n Number found at Index: " + index);
          }else{
              System.out.print("\n Number Not Found");
          }
          long t2 = System.currentTimeMillis();
          System.out.print("\nTime taken :" + (t2-t1));
      }

      static int linearSearch(int value , int[] array){
          int size = array.length;
          for(int i = 0; i < size ; i++){
              if(array[i] == value){
                  return i;
              }
          }
          return -1;
      }
}
