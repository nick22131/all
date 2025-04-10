import java.util.Scanner;

public class p019FibonacciRecursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci series upto : ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
    public static long fibonacci(int m){
        if(m <= 1 ){
            return m ;
        }
        return fibonacci(m - 1) + fibonacci(m - 2);
    }

}
