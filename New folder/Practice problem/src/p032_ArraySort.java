import java.util.Arrays;
import java.util.Scanner;

public class p032_ArraySort {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array length : " ) ;
        int input = sc.nextInt();
        int[ ] array = new int [input]  ;
        for (int i = 0; i < input ; i ++ )  {
            array[i] = sc.nextInt();
        }
        System.out.print("\n Entered Array is : " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.print("\n Sorted Array is : " ) ;
        for (int m : array){
            System.out.print(" " + m);
        }
    }
}
