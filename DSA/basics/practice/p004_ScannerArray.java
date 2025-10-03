package basics.practice;

import java.util.Scanner;

public class p004_ScannerArray {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array elements : ");
        String input = sc.nextLine();
        String [] element = input.split(" ");
        int[] array = new int[element.length];
        for(int i = 0; i < element.length; i++){
            array[i] = Integer.parseInt(element[i]);
        }

        System.out.print(" Enterd array is :  ");
        for(int m : array){
            System.out.print(" " + m);
        }
    }
}
