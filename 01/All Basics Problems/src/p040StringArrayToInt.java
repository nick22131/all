
import java.util.Scanner;
public class p040StringArrayToInt {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter numbers separated by spaces (e.g., '1 2 3'):");
            String input = scanner.nextLine();

            String[] stringArray = input.split(" ");

            int[] intArray = new int[stringArray.length];
            for (int i = 0; i < stringArray.length; i++) {
                intArray[i] = Integer.parseInt(stringArray[i]);
            }

            System.out.println("Integers in the array:");
            for (int num : intArray) {
                System.out.print(num + " ");
            }

            scanner.close();
        }
    }

