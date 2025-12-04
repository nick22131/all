package basics.pract06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    static int getNum() {
        System.out.print("\n enter a Num: ");
        int input = scanner.nextInt();
        System.out.print("\n entered num is : " + input);
        return input;
    }

    static String getString() {
        System.out.print("\n Enter a String: ");
        String input = scanner.next();
        System.out.print("\n entered String is : " + input);
        return input;
    }

    static String getStringLine() {
        System.out.print("\n Enter String line: ");
        String input = scanner.nextLine();
        System.out.print("\n Entered String line is : " + input);
        return input;
    }

    static int getArraySize() {
        System.out.print("\n Enter array size: ");
        int input = scanner.nextInt();
        System.out.print("\n array size is : " + input);
        return input;
    }

    static int[] getArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
        }
        System.out.print("\n Array is : " + Arrays.toString(array));
        return array;
    }

    static void printArray(int[] array) {
        System.out.print("\n Array is : " + Arrays.toString(array));
    }

    static char getChar(){
        System.out.print("\n Enter a char: ");
        char input = scanner.next().charAt(0);
        return input;
    }


   static int[][] get2DArray(){
        System.out.print("\n Row: ");
        int row = scanner.nextInt();
        System.out.print("\n Column: ");
        int col = scanner.nextInt();
        int[][] array = new int[row][col] ;
        for(int i = 0 ; i < row; i++){
            for(int j = 0 ; j < array[i].length; j++){
                array[i][j] = random.nextInt(1000);
            }
        }
       System.out.print("\n Entered array is : " + Arrays.deepToString(array));
       return array;
    }


    static void print2DArray(int[][] array ){
        System.out.print("\n array is : " + Arrays.deepToString(array));
    }
}
