import java.util.Arrays;
import java.util.Scanner;

public class p050BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number arrays: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int[] a = new int[ele.length];
        for(int i = 0; i < ele.length ; i++){
            a[i] = Integer.parseInt(ele[i]);
        }
        System.out.print(" \n Entered array is: " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.print("\n sorted array is : "+ Arrays.toString(a));
        System.out.print("\n enter number to find: ");
        int k = sc.nextInt();
        boolean flag = false;
        int l = 0;
        int h = a.length - 1 ;
        while(l <= h ){
            int m = (l+h)/2;
            if(a[m]==k){
                System.out.print("\n Element found at index in sorted array : " + m);
                flag = true;
                break;
            }
            if(a[m] < k ){
                l = m + 1;
            }
            else{
                h = m-1;
            }

        }
        if(!flag){
            System.out.print("\n Element NOT found");
        }
    }
}
