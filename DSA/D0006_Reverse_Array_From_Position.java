import java.util.Arrays;
import java.util.Scanner;

public class D0006_Reverse_Array_From_Position {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size] ;
        System.out.print("enter array elements: ");
        for(int i = 0 ; i < size; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("\n entered array is : " +  Arrays.toString(array));

        System.out.print("\n enter a position from array to be reversed: ");
        int m = sc.nextInt();
        reverseArray(array, m);
        System.out.print("\n reverse array is : " + Arrays.toString(array));

    }
    static void reverseArray(int[] array, int position){
        int left = position + 1;
        int right = array.length -1 ;
        while (left < right ){
            int temp = array[left];
            array[left] = array[right];
            array[right]= temp;

            left++ ;
            right--;
        }
    }
}
