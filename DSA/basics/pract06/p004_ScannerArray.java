package basics.pract06;

import java.util.Arrays;
import java.util.Scanner;

public class p004_ScannerArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter array elements: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int[] array = new int[ele.length ];
        for(int i = 0 ; i < ele.length; i++)  {
            array[i] = Integer.parseInt(ele[i]);
        }
        System.out.print("\n Entered array is " + Arrays.toString(array));
    }
}
