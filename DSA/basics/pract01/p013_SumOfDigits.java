package basics.pract01;

import java.util.Scanner;

public class p013_SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int sum = 0;
        while(input > 0){
            int digit = input % 10;
            sum = sum + digit ;
            input = input / 10;
        }
        System.out.print("sum of Digit is : " + sum);
    }
}
