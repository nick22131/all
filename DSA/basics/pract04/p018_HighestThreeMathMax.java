package basics.pract04;

import java.util.Scanner;

public class p018_HighestThreeMathMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in  );
        System.out.print("Enter three Num: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(Math.max(a,b),c);
        System.out.print("\n Max is : " + max);
    }
}
