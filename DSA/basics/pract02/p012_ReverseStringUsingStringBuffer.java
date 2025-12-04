package basics.pract02;

import java.util.Scanner;

public class p012_ReverseStringUsingStringBuffer {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = sc.next();
        StringBuffer sb = new StringBuffer(input );
        String rev = sb.reverse().toString();
        System.out.print("\n Reverse String is : " + rev );
    }
}
