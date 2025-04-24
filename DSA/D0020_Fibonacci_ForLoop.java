import java.util.Scanner;

public class D0020_Fibonacci_ForLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number fibonacci series upto : ");
        int n = sc.nextInt();
        long startTime = System.currentTimeMillis();
        printfib(n);
        long endTime = System.currentTimeMillis();
        System.out.print("\n time taken by iterative fibonacci is : " + (endTime - startTime));
    }
    private static void printfib(int m ){
        int first = 0;
        int second = 1;
        System.out.print("\n " + first + " " + second );
        for (int i = 2 ; i <= m ; i++){
            int next = first +second;
            System.out.print(" " + next );
            first = second ;
            second = next;
        }
    }
}
