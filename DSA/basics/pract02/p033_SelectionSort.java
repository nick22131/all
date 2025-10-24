package basics.pract02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p033_SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size: ");
        int size = sc.nextInt();
        int[] array = new int[size] ;
        Random random = new Random();
        long t1 = System.currentTimeMillis();
        for(int i = 0 ; i< size; i++){
            array[i] = random.nextInt(1000);
        }
        System.out.print("\n Entered array is : " + Arrays.toString(array));
        selectionSort(array);
        System.out.print("\n Sorted array is : "  + Arrays.toString(array));
        long t2 = System.currentTimeMillis();
        long time = t2 - t1;
        System.out.print("\n time taken : "+ time   );

    }

    static void selectionSort(int[] array)  {
        int size = array.length;
        int tem = 0;
        int minIndex = 0;

        for(int i = 0; i < size ; i++){
            minIndex = i;
            for(int j = i +1; j < size; j++){
                if(array[minIndex] > array[j]){
                    minIndex = j    ;
                }
            }
            tem = array[minIndex];
            array[minIndex] = array[i];
            array[i] = tem;

        }
    }
}
