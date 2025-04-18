import java.util.Scanner;

public class Main {
    public static void main( String[ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a palindrome string : ");
        String str = sc.next();
        String org_str = str;
        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (org_str.equals(rev)) {
            System.out.println("the string is a palindrome");

        } else {
            System.out.println("the string is not a palindrome");
        }
    }}
