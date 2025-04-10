import java.util.Arrays;
import java.util.Scanner;

public class p031ArraySort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of elements in array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("enter array element: ");
        for(int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.print("sorted array is: ");
        for(int i : a){
            System.out.print(i + " ");
        }
        sc.close();

    }
}
