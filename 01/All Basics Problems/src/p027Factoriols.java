import java.util.Scanner;

public class p027Factoriols {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number up to factorials: ");
        int n = sc.nextInt();
        long fact = 1 ;
        for(int i = 1 ; i <= n ; i++)
        {
            fact = fact * i ;
        }
        System.out.print(fact);
    }
}
