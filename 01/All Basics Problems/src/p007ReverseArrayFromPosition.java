import java.util.Arrays;
import java.util.Scanner;

public class p007ReverseArrayFromPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of elements in array : " );
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.print("enter array elements :");
        for ( int i = 0 ; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("array is : " + Arrays.toString(array));

        System.out.println("enter postion from which array is reversed: ");
        int m = sc.nextInt();
        reverseArray(array, m) ;
        System.out.print("\n modified array: ");
        for (int d :array ){
            System.out.print(d + " ");
        }




    }
       public static void reverseArray(int[] a , int postion){
        int left = postion +1 ;
        int right = a.length -1 ;
         while(left<right){
             int p = a[left];
             a[left] = a[right];
             a[right]= p;
             left++;
             right--;
          }
       }
}
