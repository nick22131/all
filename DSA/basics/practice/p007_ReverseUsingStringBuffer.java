package basics.practice;

import java.util.Scanner;

public class p007_ReverseUsingStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a Number : ");
        int input = sc.nextInt();
        StringBuffer sb = new StringBuffer(String.valueOf(input));
        sb.reverse();
        int rev = Integer.parseInt(sb.toString());
        System.out.println("reverse is : " + rev);
    }
}
