package basics.pract04;

import java.util.Arrays;

public class p059_ReverseArray {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int[] array= Utility.getArray(size )  ;
       long t1 = System.nanoTime();
        int[] rev = reverseArrayBySimpleFor(array);
        long t2 = System.nanoTime();
        System.out.print("\n reversed by simple for: " + Arrays.toString(rev) + "\n time taken : " + (t2-t1));

        System.out.println();
        long t3 = System.nanoTime();
        reverseArrayFromMiddle(array);
        long t4 = System.nanoTime();
        System.out.print("reverse again is : " + Arrays.toString(array) + "\n time taken : " + (t4 - t3)    );


    }

    static int[] reverseArrayBySimpleFor(int[] array){
        int size = array.length -1;

        int[] rev = new int[array.length];
        for(int i = size  ; i >= 0; i--) {
            rev[size - i] = array[i];
                   }
        return rev;
    }

    static void  reverseArrayFromMiddle(int[] array){

        int mid = array.length / 2;

        for (int i = 0; i < array.length  ; i++) {
            int tem  = array[i];
            array[i] =array[array.length - 1 - i];
            array[array.length - 1 - i] = tem;
        }
    }
}
