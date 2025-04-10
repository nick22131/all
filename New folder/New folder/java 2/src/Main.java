import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanq = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanq.nextInt();

        if (number % 5 == 0)
            System.out.println("fizz");
        else if (number % 3 == 0)
            System.out.println("buzz");
        else if (number % 5 == 0 && number % 3 == 0);
        System.out.println("fizzbuzz");


        }
    }
