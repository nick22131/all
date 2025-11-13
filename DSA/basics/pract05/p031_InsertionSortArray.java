package basics.pract05;

import java.util.Arrays;

public class p031_InsertionSortArray {
   public static void main(String[] args){
       int size = Utility.getArraySize();
       int[] array = Utility.getArray(size);
       selectionSort(array);
       System.out.print("\n sorted : " + Arrays.toString(array));
   }

   private static void selectionSort(int[] array){
       int size = array.length;
       for (int i = 1; i < size; i++) {
           int key = array[i];
           int j = i - 1;
           while(j >= 0 && array[j] > key){
               array[j+1] = array[j];
               j--;
           }
           array[j+1] = key ;
       }
   }
}
