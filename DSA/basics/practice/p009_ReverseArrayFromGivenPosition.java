package basics.practice;

import java.util.Arrays;
import java.util.Scanner;

public class p009_ReverseArrayFromGivenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements : ");
        String input = sc.nextLine();
        String[] element = input.split(" ");
        int[] array = new int[element.length];
        for(int i = 0 ; i < element.length ; i++){
            array[i] = Integer.parseInt(element[i]);
        }
        System.out.println("Enterd array is : " + Arrays.toString(array));
        System.out.print("Enter a position from which to reverse the array : ");
        int pos = sc.nextInt();
        reverseArray(array , pos);
        System.out.println("reverse array is : " + Arrays.toString(array));
    }

    static void reverseArray(int[] array, int pos) {
        int low = pos;
        int high = array.length - 1;
        while (low < high){
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }

    }
}
