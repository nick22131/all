package basics.pract02;

import java.util.Scanner;

public class p016_SumOfEvenNumUpto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num: ");
        int input =  sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= input ; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.print("\n sum of even Number: " + sum);
    }
}
