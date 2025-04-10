import java.util.Scanner;

public class p015PalindromOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a palindrome string :");
        String input = sc.next();
        String org_str = input ;
        String rev = "";
        for (int i = input.length()-1; i >= 0; i--){
            rev = rev + input.charAt(i);

        }
        if(org_str.equals(rev)){
            System.out.print(" string is palindrome");
        }
        else {
            System.out.print("string is not");
        }


    }
}
