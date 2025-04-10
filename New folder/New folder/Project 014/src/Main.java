import java.util.Scanner;

public class Main {
    // fibonacci sequence using recursion with  comments explain it


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci sequence: ");
        for (int i = 0; i < n; i++){
            System.out.print(fibonacci(i) + " "); // here we are calling the fibonacci function and printing the result
        }
    }
    public static int fibonacci(int n){
        if (n <= 1){    // if the number is less than or equal to 1, return the number this is the base case
            return n;
        }
        return fibonacci (n-1) + fibonacci (n-2); // here we are calling the fibonacci function again and adding the result of the previous two calls

    }
}   
// recursion is a function that calls itself and this is the base case 

