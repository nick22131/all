package basics.practice01;

import java.util.Scanner;

public class p014_EvenOddDigitsCountingUntilNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : " );
        int input = sc.nextInt();
        int oCount = 0;
        int eCount = 0;
        for(int i =0 ; i <= input ; i++){
            if(i % 2 == 0){
                eCount++;
            }else{
                oCount++;
            }
        }
        System.out.println("Even count : " + eCount + "\n Odd count: " + oCount);
    }
}
