package basics.pract04;

import java.util.Arrays;

public class p048_EvenOrOddArrayElementsInArray {
    public static void main(String[] args){
        int size = Utility.getArraySize();
        int[] array = Utility.getArray(size);
        int eCount  = 0 , oCount = 0;
        for(int m : array){
            if(m % 2 == 0){
                eCount++;
            }else{
                oCount++ ;
            }
        }

        int[] eArray = new int[eCount];
        int[] oArray = new int[oCount];

        int eIndex = 0, oIndex = 0;

        for(int n : array){
            if(n % 2 == 0){
                eArray[eIndex++] = n;
            }else{
                oArray[oIndex++] = n;
            }
        }

        System.out.print("\n Even array with ele " + eCount + " : " + Arrays.toString(eArray));
        System.out.print("\n Odd array with ele " + oCount + " : " + Arrays.toString(oArray));
    }
}
