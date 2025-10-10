package basics.pract01;

import java.util.Scanner;

public class p027_PrimeNumberChecker {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int input = sc.nextInt();
        if(isPrime(input)){
            System.out.print("Yes Prime");
        }else{
            System.out.print("not prime");
        }
    }

    static boolean isPrime(int n)  {
        if(n <= 1){
            return false;
        }
        for(int i = 2 ; i < n ; i ++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
