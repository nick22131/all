package basics.pract01;

import java.util.Scanner;

public class p003_ScannerArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Elements: ");
        String n = sc.nextLine();
        String[] ele = n.split(" ");
        int[] array = new int[ele.length];
        for(int i = 0 ; i < ele.length; i++){
            array[i] = Integer.parseInt(ele[i]);
        }
        System.out.print("Entered Array is : ");
        for(int m : array){
            System.out.print(" " + m);
        }
    }
}
