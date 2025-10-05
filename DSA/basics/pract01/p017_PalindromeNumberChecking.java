package basics.pract01;

import java.util.Scanner;

public class p017_PalindromeNumberChecking {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int input = sc.nextInt();
        int org = input ;
        int rev = 0;
        while (input > 0){
            int digit = input % 10;
            rev = rev * 10 + digit ;
            input = input / 10;
        }
        if(rev == org){
            System.out.print("Num is Palindrome");
        }else{
            System.out.print("Not ");
        }
    }
}
