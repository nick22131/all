package basics.pract02;

import java.util.Arrays;
import java.util.Scanner;

public class p009_ReverseArrayFromGivenPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        String input = sc.nextLine();
        String[] elements = input.split(" ");
        int[] array = new int[elements.length];
        for(int i = 0; i < elements.length; i ++){
            array[i] = Integer.parseInt(elements[i]);
        }
        System.out.print("\n Entered array is : " + Arrays.toString(array));
        System.out.print("\n Enter from position given array to be reversed: ");
        int pos = sc.nextInt();
        reverseArray(array,pos);
        System.out.print("\n reverse is : " + Arrays.toString(array));
    }

    static void reverseArray(int[] array, int pos){
        int low = pos;
        int high = array.length - 1;
        int tem = 0;
        while (low < high){
            tem = array[low];
            array[low] = array[high];
            array[high] = tem;
            low ++;
            high--;
        }
    }
}
