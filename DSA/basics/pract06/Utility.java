import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Utility {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    static int getNum(){
        System.out.print("\n enter a Num: ");
        int input = scanner.nextInt();
        System.out.print("\n entered Num is : "+ input);
        return input;
    }

    static String getString(){
        System.out.print("\n enter a string: ");
        String input = scanner.next();
        System.out.print("\n entered string is :  " + input);
        return input;
    }

    static String getStringLine(){
        System.out.print("\n enter a String line: ");
        String input = scanner.nextLine();
        System.out.print("\n entered String line is: "+ input);
        return input;
    }

    static int getArraySize(){
        System.out.print("\n enter a array size:  ");
        int input = scanner.nextInt();
        System.out.print("\n array size : " + input);
        return input;
    }

    static int[] getArray(int size){
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = random.nextInt(400);
        }
        System.out.print("\n enterd array is : "+ Arrays.toString(array));
        return array;
    }

    static void printArray(int[] array){
        System.out.print("\n array enterd is: " + Arrays.toString(array));
    }

    static char getChar(){
        System.out.print("\n enter char: ");
        char input = scanner.next().charAt(0);
        return input;
    }

    static int[][] get2DArray(){
        System.out.print("\n row: ");
        int row = scanner.nextInt();
        System.out.print("\n column: ");
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(400);
            }
        }

        System.out.print("\n 2D array is : " + Arrays.deepToString(array));
        return array;
    }



}
