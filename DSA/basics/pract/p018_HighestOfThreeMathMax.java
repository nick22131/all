package basics.pract;

import java.util.Scanner;

public class p018_HighestOfThreeMathMax {
    public static void main(String[ ] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest = Math.max(Math.max(a,b),c);
        System.out.print("Max: " + largest);
    }
}
