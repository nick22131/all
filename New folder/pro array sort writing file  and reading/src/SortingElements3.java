import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingElements3 {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array ele : ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        Integer[] arr = new Integer [ele.length];
        for( int i = 0 ; i < ele.length; i++ ) {
            arr [i] = Integer.parseInt(ele[i]);
        }
        System.out.print("array : ");
        for (int i : arr)    {
            System.out.print(i + " ");
        }
          Arrays.sort(arr,Collections.reverseOrder());
        System.out.print(" reverse order : " + Arrays.toString(arr));
    }
}
