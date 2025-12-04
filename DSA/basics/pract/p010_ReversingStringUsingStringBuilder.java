package basics.pract;

import java.util.Scanner;

public class p010_ReversingStringUsingStringBuilder {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to Reverse: ");
        String input = sc.next();
        StringBuilder sb = new StringBuilder(input);
        String rev = sb.reverse().toString();
        System.out.print("\n Reverse String of Given Input is : " + rev);

    }
}
