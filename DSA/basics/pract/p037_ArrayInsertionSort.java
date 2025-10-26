package basics.pract;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p037_ArrayInsertionSort {
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Size of Array: ");
          int size = sc.nextInt();
          int[] array = new int[size];
          Random ran = new Random();
          long t1 = System.currentTimeMillis();
          for(int i = 0; i < size; i++){
              array[i] = ran.nextInt(10000        );
          }
          System.out.print("\n Before Sorting : " + Arrays.toString(array));
          insertionSort(array);
          System.out.print("\n After Sorting : " + Arrays.toString(array));
          long t2 = System.currentTimeMillis();
          System.out.print("\n Time Taken: " + (t2-t1));
      }

      static void insertionSort(int[] array) {
          int size = array.length;
          for(int i = 1; i < size ; i++){
              int tem = array[i];
              int j = i-1;
              while(j >= 0 && array[j] > tem){
                  array[j+1] = array[j];
                  j--;
              }
              array[j+1] = tem;
          }
      }

}
