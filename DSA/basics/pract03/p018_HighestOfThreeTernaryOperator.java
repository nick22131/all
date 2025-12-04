package basics.pract03;

import java.util.Scanner;

public class p018_HighestOfThreeTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three No: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = (a>b ? a:b) > c ? (a>b ? a:b) :c;
        System.out.print("Max one is: " + max);

    }
}
