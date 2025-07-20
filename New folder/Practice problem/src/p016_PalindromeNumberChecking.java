import java.util.Scanner;

public class p016_PalindromeNumberChecking {
   public static void main(String[] args ) {
       Scanner sc = new Scanner (System.in);
       System.out.print("Enter a Number to Check if it is a Palindrome or Not : ");
       int input = sc.nextInt();
       int org_num = input;
       int rev = 0;
       while(input > 0){
           int digit = input % 10;
           rev = rev * 10 + digit ;
           input = input / 10 ;
       }
       if (rev == org_num){
           System.out.print("Entered Number is Palindrome");
       }else {
           System.out.print("Not Palindrome");
       }
   }
}
