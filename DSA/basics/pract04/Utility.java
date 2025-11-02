package basics.pract04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Utility {
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

    static String getStringLine(){
        System.out.print("\n Enter String line : ");
        String input = scanner.nextLine();
        System.out.print("\n Entered String is : " +input);
        return input ;
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
        System.out.print("\n Entered Array is : " + Arrays.toString(array));
        return array;
    }


    public static char getChar(){
        System.out.print("Enter a char: ");
        char input = scanner.next().charAt(0);
        return input;
    }

    public static int[][] get2DArray(){
        System.out.print("\n enter Rows : ");
        int row = scanner.nextInt();
        System.out.print("\n enter column: ");
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                array[i][j] = random.nextInt(200);
            }
        }
        return array;
    }

    public static void print2DArray(int[][] array){
        System.out.print("\n 2D String : " + Arrays.deepToString(array));
    }


    public static void printArray(int[] array){
        System.out.print("\n Array entered : " + Arrays.toString(array));
    }

}
