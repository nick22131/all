package basics.pract01;

import java.util.Scanner;

public class p006_ReverseNumberUsingStringBuilder {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();
        System.out.println("Reverse is : " + sb.toString());
    }
}
