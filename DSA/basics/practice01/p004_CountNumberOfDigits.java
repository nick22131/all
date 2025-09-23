package basics.practice01;

import java.util.Scanner;

public class p004_CountNumberOfDigits {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int count = 0;
        while(num > 0){
            num = num / 10;
            count ++;
        }
        System.out.print("Number of Digit r :  " + count);
    }

}
