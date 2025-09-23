package basics.practice01;

import java.util.Scanner;

public class p003_ScannerArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Elements : ");
        String input = sc.nextLine();
        String [ ] element = input.split(" ");
        int[] array = new int[element.length];
        for(int i = 0 ; i < element.length; i++){
            array[i] = Integer.parseInt(element[i]);
        }
        System.out.print("Enterd Array Is : ");
        for(int m : array){
            System.out.print(" " + m);
        }
     }
}
