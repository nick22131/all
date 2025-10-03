package basics.practice;

import java.util.Scanner;

public class p006_ReverseNumberUsingStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a Number to reverse: ");
        int input = sc.nextInt();
        StringBuilder sb = new StringBuilder(String.valueOf(input));
        sb.reverse();
        int rev = Integer.parseInt(sb.toString());
        System.out.println("Reverse is : " + rev);
    }
}
