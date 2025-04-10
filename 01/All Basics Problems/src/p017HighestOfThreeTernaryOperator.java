import java.util.Scanner;

public class p017HighestOfThreeTernaryOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter three no: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int m = (a>b?a:b) > c ? (a>b?a:b):c ;
        System.out.print("max: " + m);
    }
}
