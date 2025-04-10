import java.util.Arrays;
import java.util.Scanner;

public class SortingElements2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array ele ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int[] arr = new int[ele.length];
        for (int i = 0; i < ele.length; i++) {
            arr[i] = Integer.parseInt(ele[i]);
        }
        System.out.print("arra ;");
        for(int i = 0; i< arr.length ; i++){
            System.out.print( arr[i] + " ");
        }
        Arrays.parallelSort(arr);
        System.out.print("sorted array is : " + Arrays.toString(arr));
    }
}
