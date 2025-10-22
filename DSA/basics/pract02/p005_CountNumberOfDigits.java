package basics.pract02;

import java.util.Scanner;

public class p005_CountNumberOfDigits {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a Num: ");
        int input = sc.nextInt();
        int count = 0;
        while(input > 0){
            input = input / 10;
            count++;
        }
        System.out.print("\n number of digits are : " + count);
    }
}
