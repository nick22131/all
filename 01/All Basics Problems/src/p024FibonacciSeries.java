import java.util.Scanner;

public class p024FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number for series up to: ");
        int n= sc.nextInt();
        int a = 0 ;
        int b = 1 ;
        int sum = 0 ;
        System.out.print(a +" " + b);
        for(int i=2; i < n ; i++){
            sum = a+b ;
            System.out.print(" "+ sum);
            a = b;
            b = sum;
        }


    }
}
