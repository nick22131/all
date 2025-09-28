package basics.practice01;

import java.util.Scanner;

public class p015_SumOfEvenUpto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int input = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= input; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("sum of even Numbers Upto " + input + " : " + sum);
    }
}
