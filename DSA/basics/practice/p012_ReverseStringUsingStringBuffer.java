package basics.practice;

import java.util.Scanner;

public class p012_ReverseStringUsingStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a String : ");
        String input = sc.next();
        StringBuffer sb = new StringBuffer(input );
        String rev = sb.reverse().toString();
        System.out.println("reverse String is : " + rev);
    }
}
