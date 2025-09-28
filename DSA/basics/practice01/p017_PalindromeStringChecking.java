package basics.practice01;

import java.util.Scanner;

public class p017_PalindromeStringChecking {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String input = sc.next();
        String org = input;
        String rev = "";
        for (int i = input.length() -1 ; i >0 ; i--){
            rev = rev + input.charAt(i);
        }
        if (rev.equals(org)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrome");
        }
    }
}
