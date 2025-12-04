package basics.pract;

import java.util.Arrays;
import java.util.Scanner;

public class p034_ArraysSelectionSort {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Elements: ");
        String input = sc.nextLine();
        String[] element = input.split(" ");
        int[] array = new int[element.length]   ;
        for(int i = 0; i < element.length; i++ ){
            array[i] =  Integer.parseInt(element[i]);
        }
        long t1 = System.currentTimeMillis();

        System.out.print("\n Before Sorting: " + Arrays.toString(array));
        selectionSort(array);
        System.out.print("\n After Sorting : "+ Arrays.toString(array));

        long t2 = System.currentTimeMillis();
        System.out.print("\n Time Taken: " + (t2-t1));
    }
    static void selectionSort(int[] array){
        int size = array.length ;
        int tem = 0;
        int minIndex = 0;
        for(int i = 0; i < size ; i++){
            minIndex = i;
            for(int j = i+1; j < size ; j++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            tem = array[minIndex];
            array[minIndex] = array[i] ;
            array[i] = tem;
        }
    }
}
