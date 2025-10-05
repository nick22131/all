package basics.pract01;

import java.util.Arrays;
import java.util.Scanner;

public class p008_ReversArrayFromGivenPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter array elements: ");
        for(int i = 0 ; i < size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Entered Array is : " + Arrays.toString(array));
        System.out.print("Enter positon from where to reverse: ");
        int pos = sc.nextInt();
        reverseArray(array,pos);
        System.out.println("Revers array: " + Arrays.toString(array));
    }

    private static void reverseArray(int[] array, int pos) {
        int low = pos;
        int high = array.length -1 ;
        while(low < high){
            int tem = array[low]  ;
            array[low] = array[high];
            array[high] = tem;
            low++;
            high--;
        }
    }
}
