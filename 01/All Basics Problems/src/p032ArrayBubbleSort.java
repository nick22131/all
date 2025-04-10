import java.util.Arrays;
import java.util.Scanner;

public class p032ArrayBubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array elements: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int[] array = new int[ele.length];
        for(int i = 0; i < ele.length; i++){
            array[i] = Integer.parseInt(ele[i]);
        }
        System.out.print("array is: " + Arrays.toString(array));

        for(int i = 0 ; i < array.length - 1 ; i++){
            for(int j = 0 ; j < array.length -1 ; j++){
                if(array[j] > array[j+1] ){
                    int tem = array[j];
                    array[j]= array[j+1];
                    array[j+1] = tem;
                }
            }
        }
      System.out.print(" \n Sorted array is: " + Arrays.toString(array));



    }
}
