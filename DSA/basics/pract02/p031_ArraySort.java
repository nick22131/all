package basics.pract02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p031_ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int input = sc.nextInt();
        int[] array = new int[input ];
        Random random = new Random();
        for(int i = 0; i < input ; i++){
            array[i] = random.nextInt(1000);
        }
        System.out.print("\n entered array is : " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.print("\n sorted array is : " + Arrays.toString(array));

    }
}
