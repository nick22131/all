package basics.pract01;

import java.util.Scanner;

public class p020_HighestOfThreeTernaryOperator {
    public static void main(String []  args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three Num: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;

        System.out.print("Max one is : " + max);
    }
}
