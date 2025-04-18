import java.util.Scanner;

public class p05TryExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to dived 50 :  ");
        int n = sc.nextInt();
        try{
            int data = 50 / n ;
            System.out.print(" result : " + data );
        }
        catch (ArithmeticException e ) {
            System.out.print("can't dived by zero ");
        }
        System.out.print(" program continues ");
    }
}
