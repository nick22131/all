package basics.pract01;

import java.util.Arrays;
import java.util.Scanner;

public class p035_ArraySelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int [] array = new int[ele.length];
        for(int i = 0 ; i < ele.length; i ++){
            array[i] = Integer.parseInt(ele[i]);
        }

        System.out.print("\n entered Array is : " + Arrays.toString(array));
        long t1 = System.currentTimeMillis();
        selectionSort(array);
        System.out.print("\n sorted array is : " + Arrays.toString(array));
        long t2 = System.currentTimeMillis();
        long time = t2 - t1;
        System.out.print("\n time taken: " + time);
    }

    static void selectionSort(int[] array ){
        int size = array.length;
        int tem = 0;
        int maxIndex =0;
        for(int i = 0 ; i < size - 1; i++){
            maxIndex = i;
            for(int j = i+1; j < size ; j++ ){
                if(array[maxIndex] < array[j]){
                    maxIndex = j;
                }
            }
            tem = array[i];
            array[i] = array[maxIndex]  ;
            array[maxIndex] = tem;
        }
    }
}
