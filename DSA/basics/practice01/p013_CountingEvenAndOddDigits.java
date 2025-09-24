package basics.practice01;

import java.util.Scanner;

public class p013_CountingEvenAndOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :  ");
        int input = sc.nextInt();
        int oCount = 0;
        int eCount = 0;
        while (input > 0){
            int remender = input % 10;
            if (remender % 2 == 0){
                eCount ++;
            }
            else {
                oCount++;
            }
            input = input /10;

        }

        System.out.println("even count is : " + eCount + "  Odd count is : " + oCount);
    }
}
