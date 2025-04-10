import java.util.Scanner;

public class p04RecursiveExampleFibonacciSeries {
    public static void main(String[] args){
        System.out.print("Enter a number upto for fibonacci series: "  );
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        for(int i = 0; i< a ; i++ )
            System.out.print(" " + fibonacci(i));
    }

    public static int fibonacci(int n ){
        if(n <= 1) return n ;
        return fibonacci(n-1) + fibonacci(n- 2);
    }
}
