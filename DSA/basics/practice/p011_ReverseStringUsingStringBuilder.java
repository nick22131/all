package basics.practice;

import java.util.Scanner;

public class p011_ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a String to reverse: ");
        String input = sc.next();
        StringBuilder sb = new StringBuilder(input);
        String rev = sb.reverse().toString();
        System.out.println("enterd element is : " + rev);
    }
}
