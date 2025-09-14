package DSA01;

import java.util.Scanner;

public class p01Even {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <= n ; i++){
            if (i % 2 == 0){
                sum = sum + n   ;

            }
        }

        System.out.print("sum of all the Even Numbers: " + sum);
    }

}
