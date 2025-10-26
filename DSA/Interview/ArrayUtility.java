package Interview;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayUtility {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static int getArraySize (){
        System.out.print("Enter array size : ");
        int input = scanner.nextInt();
        return input;
    }

    public static int[] generateRandomArray(int size){
        int [] array = new int[size];
        for (int i = 0; i <size ; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    public static void printArray(int[] array)  {
        System.out.print("\n Array entered is: " + Arrays.toString(array));
    }

}
