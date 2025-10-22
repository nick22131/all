package sorting_Algo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p006_InsertionSort {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        long t1 = System.currentTimeMillis();
        for(int i = 0; i< size; i++){
            array[i] = random.nextInt(1000);
        }
        System.out.print("\n Entered Array is: " + Arrays.toString(array));
        insertionSort(array);
        System.out.print("\n sorted array is : " + Arrays.toString(array));
        long t2 = System.currentTimeMillis();
        long time = t2 - t1;
        System.out.print("\n time taken is: " + time);
    }

    private static void insertionSort(int[] array){
        int size = array.length;
        for(int i = 1; i < size; i++){
            int key = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }
}
