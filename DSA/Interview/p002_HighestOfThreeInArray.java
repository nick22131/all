package Interview;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p002_HighestOfThreeInArray {

    public static void main(String[] args ){
        int size = ArrayUtility.getArraySize();
        int[] array = ArrayUtility.generateRandomArray(size);
        ArrayUtility.printArray(array);

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third= Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            int n = array[i];
            if(first < n){
                third = second;
                second = first;
                first =n;
            } else if (second < n && n < first ) {
                third = second;
                second = n;
            } else if (third < n && n < second) {
                third = n ;
            }
        }

        System.out.print("\n first : " + first +
                         "\n second : " +second
                        +"\n third : " +third);
    }
}
