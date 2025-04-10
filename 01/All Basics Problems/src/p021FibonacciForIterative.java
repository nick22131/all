import java.util.Scanner;

public class p021FibonacciForIterative {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number to for fibonacci serise upto : ");
        int n = sc.nextInt();
        printFibonacci(n);
    }
    private static void printFibonacci(int m){
        int first = 0 , second = 1;
        System.out.print(first + " " + second );
        for ( int i = 2; i < m ; i++){
            int next = first + second;
            System.out.print(" " + next);
            first = second ;
            second = next ;

        }
    }
}
