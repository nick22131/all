import java.util.Scanner;

public class p025NumberPrimeOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to check prime: ");
        int n = sc.nextInt();
        if (isPrime(n)){
            System.out.print(" number is prime ");
        }
        else{
            System.out.print("number is not");

        }
    }
    private static boolean isPrime(int m){
        if (m <= 1 ){
            return false;
        }
        for(int i = 2; i < m ; i++){
            if(m % i == 0){
                return false;
            }
        }
        return true;
    }
}
