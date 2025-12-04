package basics.pract04;

import java.util.Scanner;

public class p019_HighestThreeTernaryOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in  );
        System.out.print("Enter three Num: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = (a > b ? a: b) > c ? (a > b ? a: b ) :c ;
        System.out.print("\n max one is : " + max);
    }
}
