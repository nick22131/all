package basics.pract01;

import java.util.Scanner;

public class p011_ReverseStringUsingStringBuilder {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        StringBuilder sb = new StringBuilder(input);
        String rev = sb.reverse().toString();
        System.out.print("Reverse String is: " + rev    );

    }
}
