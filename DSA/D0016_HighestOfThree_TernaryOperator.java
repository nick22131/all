import java.util.Scanner;

public class D0016_HighestOfThree_TernaryOperator {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = (a>b?a:b)> c ? (a>b?a:b): c;
        System.out.println("biggest one is :" + max);

    }

    }