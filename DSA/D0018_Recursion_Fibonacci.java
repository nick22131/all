import java.util.Scanner;

public class D0018_Recursion_Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("fibonacci series upto : ");
        int num = sc.nextInt();
        int a= 0;
        int b = 1 ;

        System.out.print("\n " + a + " " + b  );
        long startTime = System.currentTimeMillis();
        for(int i = 2; i <= num; i ++) {
            System.out.print(" " + fibonacci(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.print("\n time taken in recursion : " + (endTime - startTime));
    }
    static int fibonacci(int m){
        if(m<=1 ){
            return m;
        }
        return fibonacci(m-1) + fibonacci(m-2);
    }
}
