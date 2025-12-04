package basics.pract01;

import java.util.Scanner;

public class p007_ReverseNumberUsingStringBuffer {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        sb.reverse();
        System.out.print("Reverse is : " + sb.toString());
    }
}
