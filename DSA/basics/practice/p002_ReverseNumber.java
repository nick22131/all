package basics.practice;

import java.util.Scanner;

public class p002_ReverseNumber {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int input = sc.nextInt();
        int rev = 0;
        while(input != 0){
            int digit = input % 10;
            rev = rev * 10 + digit ;
            input = input / 10;
        }
        System.out.println("Reverse Number is : " + rev );
    }
}
