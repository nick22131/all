import java.util.Scanner;

public class D0004_ReverseNumberUsingStringBuilder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to reverse: ");
        int num = sc.nextInt();
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        sb.reverse();
        int reverse = Integer.parseInt(sb.toString());
        System.out.print("reverse number is : " + reverse);
        sc.close();
    }
}
