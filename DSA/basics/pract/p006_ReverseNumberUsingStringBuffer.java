package basics.pract;

import java.util.Scanner;

public class p006_ReverseNumberUsingStringBuffer {
    public static void main (String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to reverse : ");
        int num = sc.nextInt();
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        sb.reverse();
        int rev = Integer.parseInt(sb.toString());
        System.out.print("reverse : " + rev);
        sc.close();
    }
}
