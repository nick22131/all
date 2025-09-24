package basics.practice01;

import java.util.Scanner;

public class p010_ReverseStringUsingStringBuilder {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to reverse : ");
        String input = sc.next();
        StringBuilder sb = new StringBuilder(input);
        String rev = sb.reverse().toString();
        System.out.println("Reverse STirng is : "  + rev);
    }
}
