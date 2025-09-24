package basics.practice01;

import java.util.Arrays;
import java.util.Scanner;

public class p007_ReverseArrayFromGivenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of an Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i <size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enterd array is : " + Arrays.toString(array));
        System.out.println("Enter a Position from which array to reverse : ");
        int pos = sc.nextInt();
        reverseArray(array, pos);
        System.out.println("Reverse array is : " + Arrays.toString(array));
    }

    static void reverseArray(int[] array, int pos){
        int low = pos +1;
        int high = array.length - 1;
        while (low < high){
            int p = array[low];
            array[low] = array[high];
            array[high] = p;
            low++;
            high--;

        }
    }

}