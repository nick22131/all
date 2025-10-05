package basics.pract01;

import java.util.Scanner;

public class p002_ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int rev = 0;
        while(n != 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        System.out.println("Reverse Is : " + rev);
    }
}
