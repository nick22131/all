package basics.pract01;

import java.util.Scanner;

public class p029_FactorialIterative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a NUm: ");
        int input = sc.nextInt();
        int fact = 1;
        for (int i = 1 ; i <= input ; i ++){
            fact = fact * i ;
        }

        System.out.println("factoria is : " + fact);

    }
}
