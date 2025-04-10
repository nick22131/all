import java.util.Scanner;

public class p022FibonacciRecursive {
    public static void main(String[]args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number upto: ");
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            System.out.print(fibR(i) + " " );
        }
    }
    private static int fibR(int m){
        if(m <= 1 ){
            return m;
        }
        return fibR(m-1) + fibR(m-2);
    }
}
