package sorting_Algo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p002_BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ") ;
        int size = sc.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        long t1 =System.currentTimeMillis();
        for(int i = 0 ; i < size; i++){
            array[i] = random.nextInt(1000);
        }
        System.out.print("\n Array is : "+ Arrays.toString(array));
        bubbleSort(array);
        System.out.print("\n Sorted array is : " + Arrays.toString(array));
        long t2 = System.currentTimeMillis();
        long time = t2 - t1;
        System.out.print("\n time taken: " + time);
    }

    private static void bubbleSort(int [] array ){
        int size = array.length;
        int tem = 0;
        boolean swapped ;
        for (int i = 0; i < size; i++){
            swapped = false;
            for(int j = 1; j < size -i ; j++){
                if(array[j-1] > array[j]){
                    tem = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tem;
                    swapped =true;
                }
            }
            if(!swapped ){
                break;
            }
        }
    }
}
