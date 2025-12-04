package basics.pract;

import java.util.Scanner;

public class p011_ReverseStringUsingStringBuffer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to Reverse : ");
        String input = sc.next();
        StringBuffer sb = new StringBuffer(input);
        String rev = sb.reverse().toString();
        System.out.print("Reversed String of given input is : " + rev);
    }
}
