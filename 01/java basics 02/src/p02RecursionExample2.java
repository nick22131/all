import java.util.Scanner;

public class p02RecursionExample2 {
    public static void main(String[] args){
        System.out.print("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("factorial of  "+ a + " : " + factorial(a) );
    }
    public static int factorial(int n ){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);


    }

}
