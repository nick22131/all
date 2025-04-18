import java.util.Scanner;
// 17. Write a program to check if a number is prime or not.


public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        if(isPrime(num)){ // if the number is prime then it will print the number is prime
            System.out.println("number is prime");
        }
        else System.out.println(" not prime "); // if the number is not prime then it will print the number is not prime
        sc.close(); // close the scanner and stop the program
    }
    public static boolean isPrime(int n ){ // this is the method to check if the number is prime or not
        if (n <= 1){ // if the number is less than or equal to 1 then it will return false
            return false; // return false to the main method
        }
        for (int i = 2 ; i <= n - 1; i++ ){ // this is the loop to check if the number is prime or not
            if(n%i == 0) // if the number is divisible by i then it will return false
                return false; // return false to the main method
        }
        return true; // return true to the main method

} }
