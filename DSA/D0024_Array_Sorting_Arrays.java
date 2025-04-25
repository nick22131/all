import java.util.Arrays;
import java.util.Scanner;

public class D0024_Array_Sorting_Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Array elements: ");
        String input  = sc.nextLine();
        String[] ele = input.split(" ");
        int[] array = new int[ele.length];
        for(int i = 0 ; i < ele.length; i++){
            array[i] = Integer.parseInt(ele[i]);
        }
        System.out.print("\n Enterd array is : ");
        for(int arr : array){
            System.out.print(arr + " ");
        }
        Arrays.sort(array);
        System.out.print("\n Sorted array is : "+ Arrays.toString(array));

    }
}
