package basics.practice;

import java.util.Arrays;
import java.util.Scanner;

public class p008_ReverseArrayFromGivenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < size; i++ ){
            array[i] = sc.nextInt();
        }
        System.out.println("Entered array is : " + Arrays.toString(array));
        System.out.println("enter a position from which array to reverse : ");
        int pos = sc.nextInt();
        reversArray(array,pos);
        System.out.println("modified array is :  " + Arrays.toString(array));
    }
    static void reversArray(int[] array , int pos){
        int low = pos ;
        int high = array.length - 1;
        while(low < high){
            int tem = array[low];
            array[low] = array[high];
            array[high] = tem;
            low++;
            high--;
        }
    }
}
