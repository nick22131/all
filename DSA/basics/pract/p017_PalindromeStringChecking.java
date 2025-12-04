package basics.pract;

import java.util.Scanner;

public class p017_PalindromeStringChecking {
   public static void main (String[] args ) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a String to Check Palindrome: ");
       String input = sc.next();
       String org_string = input;
       String rev = "";
       for (int i = input.length()-1 ; i >= 0; i--){
           rev = rev + input.charAt(i);
       }
       if(rev.equals(org_string)){
           System.out.print("it is Palindrome");
       }
       else {
           System.out.print("not Palindrome");
       }
    }
}
