package basics;

import java.util.Arrays;
import java.util.Scanner;

public class p033_ArrayBubbleSort {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Array Elements : " ) ;
         String input = sc.nextLine();
         String [] element = input.split(" ");
         int [] array = new int[element.length];
         for(int i = 0; i < element.length; i++){
             array[i] = Integer.parseInt(element[i]);
         }

         long t1 = System.currentTimeMillis();

         System.out.print("\n Array before Sorting : " + Arrays.toString(array));
         bubbleSort(array);
         System.out.print("\n Array after Sorting : " + Arrays.toString(array));

         long t2 = System.currentTimeMillis();
         System.out.print("\n Time Taken : " + (t2-t1));
     }
     static void bubbleSort(int[] arr){
         int size = arr.length;
         int tem = 0;
         for(int i = 0; i < size; i++){
             for(int j = 0 ; j < size - i - 1 ; j++){
                 if(arr[j] > arr[j+1]){
                     tem = arr[j];
                     arr[j] = arr[j+1]  ;
                     arr[j+1]= tem;
                 }
             }
         }
     }
}
