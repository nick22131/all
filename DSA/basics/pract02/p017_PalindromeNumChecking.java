package basics.pract02;

import java.util.Scanner;

public class p017_PalindromeNumChecking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int input= sc.nextInt();
        int org = input ;
        int rev = 0;
        while(input > 0){
            int digit = input % 10;
            rev = rev * 10 + digit;
            input = input / 10;

        }
        if (rev == org){
            System.out.print("\n Num is palindrome");
        }else{
            System.out.print("\n Num is NOT ");
        }
    }
}
