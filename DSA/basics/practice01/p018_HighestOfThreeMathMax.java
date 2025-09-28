package basics.practice01;

import java.util.Scanner;

public class p018_HighestOfThreeMathMax {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Three Numbers : ") ;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(Math.max(a,b), c);
        System.out.println("max number is : " + max);
    }

}
