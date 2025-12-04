package basics.pract04;

public class p043_MaxIn2DArray {

    public static void main(String[] args){
        int[][] array= Utility.get2DArray( );
        Utility.print2DArray(array);
        int max = maxIn2DArray(array);
        System.out.print("\n Max in 2D array : " + max);
    }
    static int maxIn2DArray(int[][] array){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length ; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
