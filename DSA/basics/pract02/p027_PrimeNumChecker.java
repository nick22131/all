package basics.pract02;

import java.util.Scanner;

public class p027_PrimeNumChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num to check prime: ");
        int input = sc.nextInt();
        if(isPrime(input)){
            System.out.print("\n Num is Prime");
        }else{
            System.out.print("\n Num is NOT prime");
        }
    }
    static boolean isPrime(int m){
        if(m <= 1){
            return false;
        }
        for(int i = 2 ; i < m ; i++){
            if(m % i == 0){
                return false;
            }

        }
        return true;
    }
}
