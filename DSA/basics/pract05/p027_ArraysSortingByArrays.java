package basics.pract05;

import java.util.Arrays;

public class p027_ArraysSortingByArrays {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int[] array = Utility.getArray(size);
        Arrays.sort(array);
        System.out.print("\n sorted array is: " + Arrays.toString(array));
    }
}
