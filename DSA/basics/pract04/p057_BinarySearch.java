package basics.pract04;

import java.util.Arrays;

public class p057_BinarySearch {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int[] array = Utility.getArray(size);
        Arrays.sort(array);
        System.out.print("\n sorted array is : " + Arrays.toString(array));
        System.out.print("\n enter element to search : ");
        int target = Utility.getNumber();
        int index = binarySearch(array, target  );
        if(index == -1){
            System.out.print("\n not fourn ");
        }
        else{
            System.out.print("\n found ata index : " + index    );
        }
    }
    private static int binarySearch(int [] array, int target){
        int low = 0 , high = array.length -1;
        while(low <= high){
            int mid = low + high/2;
            if(array[mid] == target){
                return mid ;
            }
            if(array[mid] < target){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }
}
