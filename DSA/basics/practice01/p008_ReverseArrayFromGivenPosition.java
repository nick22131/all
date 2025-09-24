package basics.practice01;

import java.util.Arrays;
import java.util.Scanner;

public class p008_ReverseArrayFromGivenPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Elements: ");
        String input = sc.nextLine();
        String[] element = input.split(" ");
        int[] array = new int[element.length];
        for(int i = 0; i < element.length; i++){
            array[i] = Integer.parseInt(element[i]);
        }
        System.out.print("Enterd array is : ");
        for(int m : array){
            System.out.print(" " + m);
        }
        System.out.println();
        System.out.print("enter a postition from which array to reverse: " );
        int pos = sc.nextInt();
        arrayReverse(array, pos );
        System.out.println("reverse is : " + Arrays.toString(array));
    }
    static void arrayReverse(int[]array, int pos){
        int low = pos;
        int high = array.length -1;
        while(low < high){
            int p = array[low];
            array[low] = array[high];
            array[high] = p;
            low ++;
            high --;

        }
    }
}
