import java.util.Scanner;

public class D0022_Prime_NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check it is prime or not : ");
        int n = sc.nextInt();
        if(isPrime (n)){
            System.out.print("number is prime ");
        }else{
            System.out.print("number is NOT prime"  );

        }
    }

    // isPrime
    private static boolean isPrime(int m) {
        if (m <= 1) {
            return false;
        }
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }
}
