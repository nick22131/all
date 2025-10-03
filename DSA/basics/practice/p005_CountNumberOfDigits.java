package basics.practice;

import java.util.Scanner;

public class p005_CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int input = sc.nextInt();
        int count = 0;
        while (input > 0){
            input = input / 10;
            count++;
        }
        System.out.println("number of Elements : " + count );
    }
}
