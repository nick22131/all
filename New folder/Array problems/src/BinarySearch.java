import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc =   new Scanner(System.in);
        System.out.print("enter element :");
        String input = sc.nextLine();
        String [] ele = input.split(" ");
        int [] arr = new int[ele.length];
        for ( int i = 0 ; i< ele.length ; i++){
            arr[i] = Integer.parseInt(ele[i]);
        }
        System.out.print(" array is : ");
        for (int i = 0; i < arr.length ; i++){
            System.out.println(arr[i] +" ");
        }
        Arrays.sort(arr);
        System.out.println("sorted array is : ");
        for (int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.print("enter element to search : ");
        int search = sc.nextInt();
        
        int l = 0;
        int h = arr.length - 1;
        boolean flag = false;
        
        while (l <= h){
            int mid = (l+h)/2;
            if (arr[mid] == search ){
                System.out.println("element found at index : " + mid);
                flag = true;
                break;
            }
            else if (arr[mid] < search){
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }
        if (!flag){
            System.out.println("element not found");
        }
    } 
}
