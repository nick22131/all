package basics.pract05;

import java.util.Scanner;

public class p019_HighestOfThreeTernaryOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter Three Num: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = (a > b ? a : b) > b ? (a > b ? a : b) : c;

        System.out.print("\n Max is: " + max);
    }
}
