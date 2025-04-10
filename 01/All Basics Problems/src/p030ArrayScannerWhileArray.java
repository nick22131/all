import java.util.ArrayList;
import java.util.Scanner;
public class p030ArrayScannerWhileArray {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> numbers = new ArrayList<>();

            System.out.println("Enter integers (type 'done' to finish):");

            // Continue taking input until the user types 'done'
            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    numbers.add(sc.nextInt());  // Add the integer to the list
                } else {
                    String input = sc.next();
                    if (input.equalsIgnoreCase("done")) {
                        break;  // Exit the loop when 'done' is entered
                    } else {
                        System.out.println("Invalid input. Enter numbers or type 'done' to finish.");
                    }
                }
            }

            // Convert the ArrayList to an integer array
            int[] array = new int[numbers.size()];
            for (int i = 0; i < numbers.size(); i++) {
                array[i] = numbers.get(i);
            }

            // Display the entered numbers
            System.out.print("You entered: ");
            for (int num : array) {
                System.out.print(num + " ");
            }

            sc.close();
        }
    }


