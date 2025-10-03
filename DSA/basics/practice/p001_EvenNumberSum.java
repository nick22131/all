package basics.practice;

import java.util.Scanner;

public class p001_EvenNumberSum {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a Number: ");
        int input = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= input; i++  ){
            if (i % 2 == 0){
                sum = sum + i;
            }
        }

        System.out.println("sum of all even Numbers : " + sum);
    }
}
