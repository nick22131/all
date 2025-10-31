package basics.pract04;

import java.util.Arrays;

public class p027_ArraySortingByArrays {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int[] array = Utility.getArray(size);
        Utility.printArray(array);

        Arrays.sort(array);

        Utility.printArray(array);
    }
}
