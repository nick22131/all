package basics.pract02;

import java.util.Scanner;

public class p002_ReverseNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int input = sc.nextInt();
        int rev = 0;
        while(input != 0){
            int digit = input % 10;
            rev = rev * 10 + digit ;
            input = input / 10;
        }
        System.out.print("\n Reverse Num is : " + rev);
    }
}
