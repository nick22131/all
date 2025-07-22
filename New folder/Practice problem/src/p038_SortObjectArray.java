import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p038_SortObjectArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array elements: ");
        String input = sc.nextLine();
        String[] element = input.split(" ");
        Integer[] array = new Integer[element.length];
        long t1 = System.currentTimeMillis();
        for(int i = 0; i < element.length; i++ ){
            array[i] = Integer.parseInt(element[i]);
        }
        System.out.print(" \n Array before Sorting: " + Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.print(" \n After Sorting : " + Arrays.toString(array));
        long t2 = System.currentTimeMillis();
        System.out.print("\n Time taken: " + (t2-t1));
    }
}
