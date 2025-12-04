package basics.pract02;

import java.util.Scanner;

public class p006_ReverseNumUsingStringBuilder {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int input = sc.nextInt();
        StringBuilder sb = new StringBuilder(String.valueOf(input));
        sb.reverse();
        int rev = Integer.parseInt(sb.toString());
        System.out.print("\n reverse is : " + rev);
    }
}
