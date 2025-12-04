package sorting_Algo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p005_SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        long t1 = System.currentTimeMillis();
        for(int i = 0 ; i < size; i++){
            array[i] = random.nextInt(1000);
        }
        System.out.print("\n Entered array is: " + Arrays.toString(array));
        selectionSort(array);
        System.out.print("\n sorted array is : " + Arrays.toString(array));
        long t2 = System.currentTimeMillis();
        long time = t2 - t1;
        System.out.print("\n time taken : " + time);
    }

    private static void selectionSort(int[] array){
        for(int i= 0; i < array.length; i++){
            int last = array.length - i -1;
            int maxIndex = getMaxIndex(array, 0 , last);
            swap(array,last,maxIndex);

        }
    }

    private static int getMaxIndex(int[] array , int start, int end){
        int max = start;
        for(int i = start; i <= end; i ++){
            if(array[max] < array[i]){
                max = i;
            }
        }
        return max;
    }
    private static void swap(int[] array, int first, int second){
        int tem = array[first];
        array[first] = array[second];
        array[second] = tem;
    }
}
