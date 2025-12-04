package basics.pract;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p051_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of Array: ");
        int size = sc.nextInt();
        int[] array = new int[size] ;
        Random ran = new Random()   ;
        for(int i = 0; i < size ; i++){
            array[i] = ran.nextInt(10000);
        }
        Arrays.sort(array);
        System.out.print("\n Array is : " + Arrays.toString(array));
        System.out.print("\n Enter a element to be found : ");
        int target = sc.nextInt();
        long t1 = System.currentTimeMillis();
        int index = binarySearch(array,target);
        if(index != -1 ){
            System.out.print("\n Element found at index : "+ index);
        }else{
            System.out.print("\n Element Not found");
        }
        long t2 = System.currentTimeMillis();
        System.out.print("\n Time Taken : " + (t2 - t1));
    }

    static int binarySearch(int[] array , int target){
        int low = 0;
        int high = array.length -1;
        while(low <= high){
            int mid = low + (high - low )/2;
            if(array[mid] == target ){
                return mid ;
            }
            if(array[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return - 1;
    }
}
