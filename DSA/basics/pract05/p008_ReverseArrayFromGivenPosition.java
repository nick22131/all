package basics.pract05;

import java.util.Arrays;

public class p008_ReverseArrayFromGivenPosition {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int[] array = Utility.getArray(size);
        System.out.print("\n enter from where to reverse: ");
        int pos = Utility.getNum();
        reverseArray(array,pos);
        System.out.print("reverse: " + Arrays.toString(array));
    }

    private static void reverseArray(int[] array,int pos){
        int low = pos;
        int high= array.length-1;
        int tem = 0;
        while(low < high){
            tem = array[low];
            array[low]= array[high];
            array[high] = tem;
            low ++;
            high--;
        }
    }
}
