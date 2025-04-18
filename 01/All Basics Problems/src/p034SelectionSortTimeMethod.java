import java.util.Arrays;
import java.util.Random;

public class p034SelectionSortTimeMethod {
    public static void main(String[] args){
        int[] num = new int[10];
        Random ran = new Random();
        for(int i = 0; i < num.length; i++ ){
            num[i]= ran.nextInt(1000);
        }
        System.out.print(Arrays.toString(num));
        long startTime = System.currentTimeMillis();
        selectionSort(num);
        long endTime = System.currentTimeMillis();
        System.out.print("Took " + (endTime - startTime)+ "ms" );
        System.out.print(Arrays.toString(num));
    }
    private static void selectionSort(int[]a ){
        int l = a.length;
        for(int i = 0; i < l-1 ; i  ++){
            int min = a[i];
            int indexOfMin = i ;
            for(int j = i+1 ; j < l ; j++){
                if(a[j]<min){
                    min = a[j];
                    indexOfMin = j ;
                }
            }
            swap(a, i , indexOfMin );
        }
    }
    private static void swap(int[]b,int c , int d){
        int tem =b[c];
        b[c] = b[d];
        b[d] = tem;
    }
}
