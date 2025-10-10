package basics.pract01;

import java.util.Arrays;
import java.util.Scanner;

public class p034_ArraySelectionSort {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        String input  = sc.nextLine();
        String[] ele = input.split(" ");
        int[] array = new int[ele.length];
        for(int i = 0; i < ele.length; i++){
            array[i] = Integer.parseInt(ele[i]);
        }
        long t1 = System.currentTimeMillis();
        System.out.print("\nEntered array is : " + Arrays.toString(array));
        selectionSort(array);
        System.out.print("\n Sorted array is : " + Arrays.toString(array));
        long t2 = System.currentTimeMillis();
        long time = t2 - t1 ;
        System.out.print("\n Time taken is : " + time);
    }

    static void selectionSort(int[] array ){
        int size = array.length;
        int tem = 0;
        int minIndex = 0;
        for(int i = 0 ; i < size - 1; i ++){
            minIndex = i;
            for(int j = i +1 ; j < size ; j++){
                if( array[minIndex] > array[j]){
                    minIndex = j ;
                }
            }
            tem = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tem;
        }
    }
}
