
import java.util.Scanner;
    /* here we are using memoization to store the results of the function calls in an array to avoid redundant calculations
        in recursive calls       */
public class Main{
    private static long[] fibonacciCache; // this is the array to store the results of the function calls

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a num : ");
        int n = sc.nextInt();
        fibonacciCache = new long[n + 1]; // this is the array to store the results of the function calls
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " "); // here we are calling the fibonacci function and printing the result
        }
    }

    private static long fibonacci(int n) { // this is the function to calculate the fibonacci sequence
        if (n <= 1) { // if the number is less than or equal to 1, return the number this is the base case
            return n;   // its returning the number AND the base case is the number itself
        }

        if (fibonacciCache[n] != 0) { // here we are checking if the result is already in the array n ! = 0 means the result is not 0
            return fibonacciCache[n]; // if the result is already in the array, return the result
        }

        long nthFibonacciNumber = (fibonacci(n - 1) + fibonacci(n - 2)); // here we are calling the fibonacci function again and adding the result of the previous two calls
        fibonacciCache[n] = nthFibonacciNumber; // here we are storing the result in the array

        return nthFibonacciNumber;
    }
}

