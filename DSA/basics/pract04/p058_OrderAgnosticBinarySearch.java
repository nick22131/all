package basics.pract04;

import java.util.Arrays;

public class p058_OrderAgnosticBinarySearch {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int[] array = Utility.getArray(size);
        Arrays.sort(array);
    }
}
