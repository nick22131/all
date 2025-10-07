package basics.pract01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class p032_ArraySort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array length: ");
        int size  = sc.nextInt();
        int[] array = new int[size];
        System.out.print("\n enter array elements: ");
        for(int i = 0 ; i < size ; i ++){
            array[i] = sc.nextInt();
        }
        System.out.print("\n enterd array is : " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.print("\n sorted array is : " );
        for (int n : array ){
            System.out.print(" " + n);
        }
    }
}
