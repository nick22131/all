package basics.pract02;

import java.util.Arrays;
import java.util.Scanner;

public class p008_ReverseArrayFromGivenPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("\n Enter array elements: ");
        for(int i = 0 ; i < size; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("\n Entered array is : " + Arrays.toString(array));
        System.out.print("\n Enter position from which to reverse array : ");
        int post = sc.nextInt();
        reverseArray(array,post);
        System.out.print("Reverse is : " + Arrays.toString(array));
    }

    static void reverseArray(int[] array , int pos) {
        int low = pos;
        int high = array.length - 1 ;
        while (low < high){
            int tem = array[low];
            array[low] = array[high];
            array[high] = tem;
            low ++;
            high --;
        }
    }
}
