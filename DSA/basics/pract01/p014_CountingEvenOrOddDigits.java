package basics.pract01;

import java.util.Scanner;

public class p014_CountingEvenOrOddDigits {
    public static void main(String[ ] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int input = sc.nextInt();
        int oCount = 0;
        int eCount = 0;
        while(input > 0){
            int digit = input % 10;
            if(digit % 2 == 0){
                eCount++;
            }else{
                oCount++;
            }
            input = input/10;
        }
        System.out.print("even : " + eCount+ "\nOdd : " + oCount);
    }
}
