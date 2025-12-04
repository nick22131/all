package basics.pract04;

import java.util.Arrays;
import java.util.Scanner;

public class p046_StringArrayScannerToIntWithErrorHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        int[] array = new int[ele.length];
        for(int i = 0; i < ele.length; i++){
            try{
                array[i] = Integer.parseInt(ele[i]);
            }catch(NumberFormatException e){
                System.out.print("\n invalid input  " + ele[i] + "skipping... " );
                array[i] = 0;
            }
        }
        System.out.print("\n array entered : " + Arrays.toString(array));
    }

}
