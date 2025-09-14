package DSA01;

import java.util.Arrays;
import java.util.Scanner;

public class p04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of an Array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("\n Enter the Array elements: ");
        for(int i = 0; i < size ; i++){
            array[i] = sc.nextInt();
        }

        System.out.print("Entered Array is : " + Arrays.toString(array) );

    }
}
