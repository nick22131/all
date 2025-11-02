package basics.pract04;

import java.util.Arrays;

public class p042_LinearSearch2DArray {
    public static void main(String[] args) {
        int [] [] array = Utility.get2DArray();
        Utility.print2DArray(array);
        System.out.print("\n enter element to get index ");
        int target = Utility.getNumber();
        int [] index = linearSearch(array,target)    ;

        System.out.print("index in 2D array is : " + Arrays.toString(index));

    }

    static int[] linearSearch(int[][]array,int target){
        for(int i =0 ; i < array.length; i++ ){
            for(int j = 0; j < array[i].length; j++){

                if(array[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
