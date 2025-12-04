package basics.pract02;

import java.util.Scanner;

public class p028_FactorialIterative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Factorial upto: ");
        int input = sc.nextInt();
        int fact = 1;
        for(int i = 1 ; i <= input ; i++){
            fact = fact * i;
        }
        System.out.print("\n factorial of "+ input + " : " + fact);
    }
}
