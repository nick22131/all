package basics.pract04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static int getNumber(){
        System.out.print("Enter a NUM: ");
        int input = scanner.nextInt();
        return input;
    }

    public static String getString(){
        System.out.print("Enter a String: ");
        String input = scanner.next();
        return input;
    }

    public static int getArraySize(){
        System.out.print("Enter Array size: ");
        int input = scanner.nextInt();
        return input;
    }

    public static int[] getArray(int size){
        int[] array = new int[size];
        for (int i = 0; i <size ; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }



    public static void printArray(int[] array){
        System.out.print("\n Array entered : " + Arrays.toString(array));
    }

}
