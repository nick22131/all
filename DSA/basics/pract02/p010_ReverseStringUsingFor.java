package basics.pract02;

import java.util.Scanner;

public class p010_ReverseStringUsingFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.next();
        String rev = "";
        for(int i = input.length() -1 ; i >= 0; i--){
            rev = rev + input.charAt(i);
        }
        System.out.print("\n rev string is : " + rev );
    }
}
