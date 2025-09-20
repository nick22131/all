package basics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p042_EvenOrOddArray {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        int size = sc.nextInt() ;
        int[] array = new int[size];
        Random ran = new Random();
        for(int i = 0; i < size ; i++){
            array[i] = ran.nextInt(1000);
        }
        System.out.print("\nArray is : " + Arrays.toString(array));

        System.out.print("\n Even no : ");
        for(int i : array){
            if(i%2 == 0  ){
                System.out.print(" " + i);
            }
        }
        System.out.print("\n odd : ");
        for(int i : array){
            if(i%2 != 0){
                System.out.print(" " + i);
            }
        }

    }
}
