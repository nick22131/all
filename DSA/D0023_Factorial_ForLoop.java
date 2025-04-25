import java.util.Scanner;

public class D0023_Factorial_ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to cal factorial: ");
        int n = sc.nextInt();
        long fact = 1 ;
        for (int i =1 ; i <= n; i ++){
            fact = fact * i ;
        }
        System.out.print("Factorial of "  + n + " : " + fact);
    }
}
