import java.util.Scanner;

public class FactorialNumber {
    public static void main (String[] args){ // this is the main method where the program starts 
        Scanner sc = new Scanner(System.in); // this is the scanner class that is used to take input from the user
        System.out.print("Enter a number :  "); // this is the prompt that is used to ask the user to enter a number
        int num = sc.nextInt(); // this is the variable that is used to store the number entered by the user
        long r = 1; // this is the variable that is used to store the result of the factorial calculation
        for (int i = 1; i <= num; i++){ // this is the for loop that is used to calculate the factorial of the number
            r = r* i ;

        }
        System.out.println(" factorial of " + num + " is " + r); // this is the prompt that is used to display the result of the factorial calculation
    }
    // Alternatively, you can calculate the factorial by looping from the number down to 1
    // Uncomment the following loop and comment out the above loop to use this approach
        /*
        for (int i = num; i >= 1; i--) {
            factorial = factorial * i;
        }
        */

    // Print the calculated factorial
}
