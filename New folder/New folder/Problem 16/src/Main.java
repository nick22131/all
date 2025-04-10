import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        // Handle edge cases
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        // Check divisors from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { // If divisible by i, it's not prime
                return false;
            }
        }

        return true; // If no divisors were found, it's prime
    }
}