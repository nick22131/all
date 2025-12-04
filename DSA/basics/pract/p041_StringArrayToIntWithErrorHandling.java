package basics.pract;

import java.util.Arrays;
import java.util.Scanner;

public class p041_StringArrayToIntWithErrorHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ARray Elements: ");
        String input = sc.nextLine();
        String[] element = input.split(" ");
        int[] array = new int[element.length] ;
        for(int i = 0; i < element.length; i++ ){
            try {
                array[i] = Integer.parseInt(element[i]);
            }catch(NumberFormatException e ){
                System.out.print("\n Invalid input: " + element[i] + "  is not number and skipping" );
                array[i] = 0;
            }
        }
        System.out.print("\n Integer Array is : " + Arrays.toString(array));
    }
}
