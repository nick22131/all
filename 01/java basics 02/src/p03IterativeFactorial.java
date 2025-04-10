import java.util.Scanner;

public class p03IterativeFactorial {
    public static void main(String[ ] args){
        System.out.print("enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1 ;
        for (int i = 2 ; i <= n ; i++){
            result = result * i;
        }
        System.out.print(" factorial of " + n + " : " + " " + result  );
    }
}
