package basics;

import java.util.Scanner;

public class p008_ReverseArrayFromGivenPosition {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array elements : ");
        String input = sc.nextLine();
        String[] element = input.split(" ");
        int[] array = new int[element.length];
        for(int i = 0 ; i < element.length; i++){
            array[i] = Integer.parseInt(element[i]);
        }
        System.out.print("entered Array is : ");
        for(int m : array){
            System.out.print(" " + m);
        }
        System.out.print("\n enter position from at which array needs to be reversed: ");
        int pos = sc.nextInt();
        reverseArray(array, pos);
        System.out.print("\n Modified Array is : ");
        for(int m : array){
            System.out.print(" " + m);
        }
    }
    public static void reverseArray(int[]arr, int posi){
        int left = posi + 1;
        int right = arr.length - 1;
        while(left < right ) {
            int m = arr[left];
            arr[left] = arr[right];
            arr[right]= m;
            left++;
            right--;
        }
    }
}
