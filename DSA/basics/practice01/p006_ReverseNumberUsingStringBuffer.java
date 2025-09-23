package basics.practice01;

import java.util.Scanner;

public class p006_ReverseNumberUsingStringBuffer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a Number to Rev : ");
        int input = sc.nextInt();
        StringBuffer sb = new StringBuffer(String.valueOf(input) );
        sb.reverse();
        int rev = Integer.parseInt(sb.toString());
        System.out.print("Reverse No. is : " + rev      );
    }
}
