package basics.pract;

import java.util.Arrays;
import java.util.Scanner;

public class p007_ReverseArrayFromGivenPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("enter Array elements : ");
        for(int i = 0 ; i < size ; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("entered Array is : " + Arrays.toString(array));
        System.out.println("Enter a Position from which array needs to be reversed : ");
        int pos = sc.nextInt();
        reverseArray(array,pos);
        System.out.print("Modified array is : ");
        for(int a : array){
            System.out.print(" " + a);
        }
    }
    private static void reverseArray(int[]array , int pos){
        int left = pos + 1;
        int right = array.length-1;
        while(left < right ) {
            int p = array[left] ;
            array[left] = array[right]  ;
            array[right] = p;
            left++;
            right--;
        }
    }
}
