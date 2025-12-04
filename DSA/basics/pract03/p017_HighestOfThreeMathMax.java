package basics.pract03;

import java.util.Scanner;

public class p017_HighestOfThreeMathMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three No: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(Math.max(a,b), c);
        System.out.print("\n Max one is : "  + max);

    }
}
