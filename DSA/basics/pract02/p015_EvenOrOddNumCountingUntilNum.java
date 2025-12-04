package basics.pract02;

import java.util.Scanner;

public class p015_EvenOrOddNumCountingUntilNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int input = sc.nextInt();
        int oCount = 0;
        int eCount = 0;
        for(int i = 1; i <= input ; i++){
            if(i % 2 == 0 ){
                eCount++;
            }
            else{
                oCount++;
            }
        }
        System.out.print("\n Even Count : " + eCount + "  \n Odd count : " + oCount);
    }

}
