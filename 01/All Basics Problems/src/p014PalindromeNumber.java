import java.util.Scanner;

public class p014PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a palindrom  number: ");
        int num = sc.nextInt();
        int org_num = num;
        int rev = 0;
        while(num != 0){
            int digit = num % 10 ;
            rev = rev * 10 + digit;
            num = num/10;
        }
     if (org_num ==  rev){
         System.out.print("number is palindrom number");
     }
     else{
         System.out.print(" not palindrome");

        }
     sc.close();
    }
}
