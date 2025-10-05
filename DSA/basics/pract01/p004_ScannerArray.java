package basics.pract01;

import java.util.Arrays;
import java.util.Scanner;

public class p004_ScannerArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Elements : ");
        String n = sc.nextLine();
        String[] ele = n.split(" ");
        int [] array = new int[ele.length];
        for(int i = 0; i< ele.length; i++){
            array[i] = Integer.parseInt(ele[i]);
        }
        System.out.print("Array is : " + Arrays.toString(array));
    }
}
