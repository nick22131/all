package basics;

import java.util.Scanner;

public class p009_ReversingStringUsingFor {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a String to Reverse: ");
        String input = sc.next();
        String rev = "";
        for(int i = input.length()-1; i >= 0; i--){
            rev = rev + input.charAt(i);
        }
        System.out.print("Reversed String of Given input is : " + rev);
    }
}
