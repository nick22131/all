

import java.util.Scanner;

public class p028FactoriolsReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("factorial of number: ");
        int n = sc.nextInt();
        long fact = 1;
        for (int i = n; i >= 1; i--){
            fact = fact * i ;
        }
        System.out.print(fact);
    }
}
