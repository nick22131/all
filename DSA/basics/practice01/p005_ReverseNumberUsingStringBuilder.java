package basics.practice01;

import java.util.Scanner;

public class p005_ReverseNumberUsingStringBuilder {
    public static void main(String [ ] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a Number to reverse: ");
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        sb.reverse();
        int rev = Integer.parseInt(sb.toString());
        System.out.print("Reverse Number is : " + rev);
        sc.close();
    }
}
