package basics.pract;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p036_ArraySelectionSortRandomInput {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter number of Elements in Array: ");
        int input = sc.nextInt();
        Random ran = new Random();
        int[] array = new int[input];
        long t1 = System.currentTimeMillis();
        for(int i = 0 ; i < input ; i++){
          array[i] = ran.nextInt(1000);
        }
        System.out.print("\n Array Before Sorting: " + Arrays.toString(array));
        selectionSort(array);
        System.out.print("\n After Sorting : " + Arrays.toString(array));
        long t2 = System.currentTimeMillis();
        System.out.print("\n Time taken : "+ (t2 - t1));
    }
    static void selectionSort(int[] array){
        int size = array.length;
        int tem = 0;
        int minIndex = 0 ;
        for(int i = 0; i < size ; i++ ){
            minIndex = i;
            for(int j = i+1 ; j < size ; j++)  {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            tem = array[minIndex];
            array[minIndex] = array[i];
            array[i] = tem;
        }
    }
}
