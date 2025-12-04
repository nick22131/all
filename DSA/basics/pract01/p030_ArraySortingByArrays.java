package basics.pract01;

import java.util.Arrays;
import java.util.Scanner;

public class p030_ArraySortingByArrays {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int[] array = new int[ele.length];
        for(int i = 0 ; i < ele.length; i++){
            array[i] = Integer.parseInt(ele[i]);
        }
        System.out.print("\nEntered array is : " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.print("\n Sorted array is : " + Arrays.toString(array));
    }
}
