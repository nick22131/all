package Interview;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p001_SecondHighestInArray {
    public static void main(String[] args){
        int size = ArrayUtility.getArraySize();
        int[] array = ArrayUtility.generateRandomArray(size);
        ArrayUtility.printArray(array);

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i <size ; i++) {
            if(highest < array[i] ){
                secondHighest  = highest;
                highest = array[i];
            }else if (secondHighest < array[i] && array[i] < highest){
                secondHighest = array[i];
            }
        }

        System.out.print("\n highest one is : " + highest +
                " \n second highest is : " + secondHighest);

    }
}
