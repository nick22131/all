package basics.pract05;

import java.util.Arrays;

public class p030_SelectionSortArray {
   public static void main(String[] args){
       int size = Utility.getArraySize();
       int [] array = Utility.getArray(size);
       selectionSort(array);
       System.out.print("\n sorted array : " + Arrays.toString(array));
   }

   private static void selectionSort(int[] array ){
       int size = array.length ;
       int tem = 0;
       int minIndex = 0;
       for(int i= 0; i < size -1; i++){
           minIndex = i;
           for(int j = i+1; j < size ; j++){
               if(array[minIndex] > array[j]){
                   minIndex = j;
               }
           }
           tem  = array[minIndex]   ;
           array[minIndex] = array[i];
           array[i] = tem;
       }
   }
}
