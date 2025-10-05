package basics.pract01;

import java.util.Scanner;

public class p016_SumOfEvenNumbersUpto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ") ;
        int input = sc.nextInt();
        int sum = 0;
        for (int i = 1 ; i<= input ; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.print("sum of Even : " + sum);
    }
}
