import java.util.Arrays;
import java.util.Scanner;
public class p033SelectionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a element: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int [] a = new int[ele.length];
        for(int i = 0 ; i < ele.length; i++){
            a[i] = Integer.parseInt(ele[i]);
        }
        System.out.print("Array is : " + Arrays.toString(a));
        for(int i = 0 ; i < a.length- 1 ; i++){
            int minIndex = i ;
            for(int j = i + 1 ; j < a.length; j++){
                if(a[j] < a[minIndex] ){
                    minIndex = j;
                }
            }
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        System.out.print("\n Sorted array is : " + Arrays.toString(a));
    }
}