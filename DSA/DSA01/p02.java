package DSA01;

import java.util.Scanner;

public class p02 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to reverse : ");
        int num = sc.nextInt();
        int rev = 0;
        while (num != 0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        System.out.print("Reversed Number is : " + rev);
    }
}
