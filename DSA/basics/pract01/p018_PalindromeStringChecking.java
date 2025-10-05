package basics.pract01;

import java.util.Scanner;

public class p018_PalindromeStringChecking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input =sc.next();
        String rev ="";
        for (int i = input.length() -1 ; i >= 0; i--){
            rev = rev + input.charAt(i);
        }
        if(rev.equals(input)){
            System.out.print("Yes Palindrome");

        }else{
            System.out.print("Not Palindrome");
        }
    }
}
