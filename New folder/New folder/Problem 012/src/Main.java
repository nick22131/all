import java.util.Scanner;

public class Main {
    public static void main (String []args  ){
        // greater of three numbers by logic 1
        Scanner sc = new Scanner(System.in);

       /* System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("The greatest number is: " + a);
        }
        else if(b>a && b>c){
            System.out.println("The greatest number is: " + b);
        } */


        // by using ternary operator
        System.out.println("enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
       /* int larger = a > b ? a:b;
        int largest = larger > c ? larger:c ; */
        //or
        //int largest = a>b?a>c?a:c:b>c?b:c;
        // int largest = Math.max(Math.max(a,b),c);
       // int largest = Math.max(a,Math.max(b,c));
        int largest = (a>b?a:b)>c?(a>b?a:b):c;
        System.out.println("The Largest number is "  + largest);

    }
}
/*
// Import the Scanner class to read input from the user
import java.util.Scanner;

// Define the Main class
public class Main {
    // Main method - the entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        /*
        // Logic 1: Using if-else statements to find the greatest of three numbers
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt(); // Read the first number
        int b = sc.nextInt(); // Read the second number
        int c = sc.nextInt(); // Read the third number

        // Compare the numbers to find the greatest
        if (a > b && a > c) {
            System.out.println("The greatest number is: " + a); // a is the greatest
        } else if (b > a && b > c) {
            System.out.println("The greatest number is: " + b); // b is the greatest
        } else {
            System.out.println("The greatest number is: " + c); // c is the greatest
        }
        */

        // Logic 2: Using the ternary operator to find the greatest of three numbers
      /*  System.out.println("Enter three numbers: ");
        int a = sc.nextInt(); // Read the first number
        int b = sc.nextInt(); // Read the second number
        int c = sc.nextInt(); // Read the third number

        /*
        // Approach 1: Using nested ternary operators
        int larger = a > b ? a : b; // Find the larger of a and b
        int largest = larger > c ? larger : c; // Compare the larger with c to find the largest
        */

        /*
        // Approach 2: Using a single ternary operator
        int largest = a > b ? (a > c ? a : c) : (b > c ? b : c); // Compare a, b, and c in one line
        */

        /*
        // Approach 3: Using Math.max() method
        int largest = Math.max(Math.max(a, b), c); // Use Math.max() to find the largest
        */

        // Approach 4: Using a combination of ternary operator and Math.max()
     /*   int largest = (a > b ? a : b) > c ? (a > b ? a : b) : c; // Compare a, b, and c using ternary operator

        // Print the largest number
        System.out.println("The Largest number is " + largest);
    }
}  */