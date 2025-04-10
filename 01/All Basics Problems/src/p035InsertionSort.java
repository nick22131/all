import java.util.Arrays;
import java.util.Scanner;
public class p035InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a element: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int[] a = new int[ele.length];
        for( int i = 0 ; i < ele.length; i++){
            a [i] = Integer.parseInt(ele[i]);
        }
        System.out.print("\n entered a is : " + Arrays.toString(a));
        for( int i = 1; i < a.length ; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        System.out.print("\n sorted array is : " + Arrays.toString(a));
    }
}