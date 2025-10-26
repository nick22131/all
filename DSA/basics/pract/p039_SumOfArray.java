package basics.pract;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class p039_SumOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        Random ran = new Random();
        long t1 = System.currentTimeMillis();
        for(int i = 0; i < size; i++){
            array[i] = ran.nextInt(1000);
        }
        System.out.print("\nArray : " + Arrays.toString(array));
        long sum = 0;
        for(int i = 0; i < size ; i++){
            sum = sum + array[i];
        }
        System.out.print("\n Sum of Array : " + sum );
        long t2 = System.currentTimeMillis();
        System.out.print("\n time Taken : " + (t2-t1));
    }
}
