package basics.pract05;

import java.util.Scanner;

public class p019_HighestOfThreeMathMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n enter three NUM: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(Math.max(a,b),c);
        System.out.print("\n max is : " + max);
    }
}
