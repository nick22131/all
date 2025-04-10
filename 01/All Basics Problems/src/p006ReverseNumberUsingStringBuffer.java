import java.util.Scanner;

public class p006ReverseNumberUsingStringBuffer {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to reverse:");
        int n = sc.nextInt();
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        sb.reverse();
        int rev = Integer.parseInt(sb.toString());
        System.out.print("reverse no is :"+ rev) ;


    }
}
