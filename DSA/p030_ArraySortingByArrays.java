import java.util.Arrays;
import java.util.Scanner;

public class p030_ArraySortingByArrays {
   public static void main(String[] args )  {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter array elements: ");
       String input = sc.nextLine();
       String[] element = input.split(" ");
       int[] array = new int[element.length]    ;
       for(int i = 0; i < element.length ; i++){

           array[i] = Integer.parseInt(element[i]);

       }
       System.out.print("\n Entered Array is : ");
       for (int m : array){
           System.out.print(" " + m);
       }

       Arrays.sort(array);

       System.out.print("\n Sorted ARray is : ");
       for (int m : array){
           System.out.print(" " + m );
       }
   }
}
