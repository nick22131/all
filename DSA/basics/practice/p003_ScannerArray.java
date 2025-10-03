package basics.practice;

import java.util.Arrays;
import java.util.Scanner;

public class p003_ScannerArray {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Elements : ");
        String input = sc.nextLine();
        String[] elements = input.split(" ");
        int[] array = new int[elements.length];
        for (int i = 0; i < elements.length; i++){
            array[i] = Integer.parseInt(elements[i]);
        }
        System.out.println("Array is : " + Arrays.toString(array));
    }
}
