package basics.leetcode;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Utility {
          private static final Scanner scanner = new Scanner(System.in) ;
          private static final Random random = new Random();

          static int getNum(){
              System.out.print("\n Enter a NUM: ");
              int input = scanner.nextInt();
              return input ;
          }

          static String getString(){
              System.out.print("\n Enter a String: ");
              String input = scanner.next();
              return input;
          }

          static int getArraySize (){
              System.out.print("\n enter array size: ");
              int size = scanner.nextInt();
              return size;
          }

          static int[] getArray(){
              System.out.print("enter array size: ");
              int size = scanner.nextInt();
              int[] array = new int[size];
              for(int i = 0 ; i < size ; i++){
                  array[i] = random.nextInt(456);
              }
              System.out.print("\n entered array is : " + Arrays.toString(array));
              return array;
          }

          static void printArray(int[] array){
              System.out.print("\n Entered array is : " + Arrays.toString(array));
          }

          static int[][] get2DArray(){
              System.out.print("\n Enter row : ");
              int row = scanner.nextInt();
              System.out.print("\n Enter a col: ");
              int col = scanner.nextInt();
              int [][] array = new int[row][col];
              for(int i = 0; i < array.length ; i++){
                  for(int j = 0 ; j < array[i].length; j++){
                      array[i][j] = random.nextInt(568);
                  }
              }
              System.out.print("\n Entered array is : " + Arrays.deepToString(array));
              return array;
          }

          static void print2DArray(int [][] array ){
              System.out.print("Entered array is : " + Arrays.deepToString(array));
          }

          static char getChar(){
              System.out.print("Enter a Char: ");
              char input = scanner.next().charAt(0);
              return input;
          }
}
