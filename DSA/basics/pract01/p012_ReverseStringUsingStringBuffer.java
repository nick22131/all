package basics.pract01;

import java.util.Scanner;

public class p012_ReverseStringUsingStringBuffer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        StringBuffer sb = new StringBuffer(input);
        String rev = sb.reverse().toString();
        System.out.print("Reverse is : " + rev);

    }
}
