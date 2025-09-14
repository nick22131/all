package DSA01;

import java.util.Scanner;

public class p03 {
    public static void main(String [] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Array Elements: ");
        String input = sc.nextLine();
        String[] element = input.split(" ");
        int[] array = new int[element.length];
        for(int i = 0 ; i < element.length ; i++ ){
            array [i] = Integer.parseInt(element[i]);
        }

        System.out.print("Enterd Array is : ");
        for (int m : array){
            System.out.print(m + " ");
        }

    }
}
