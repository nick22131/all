package basics.pract04;

import java.util.Arrays;
import java.util.Scanner;

public class p004_ScannerArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        String input = sc.nextLine();
        String[] elements = input.split(" ");
        int[] array = new int[elements.length];
        for(int i = 0 ; i < elements.length ; i ++){
            array[i] = Integer.parseInt(elements[i]);
        }

        System.out.print("\n entered array is : " + Arrays.toString(array));
    }
}
