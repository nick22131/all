import java.util.Scanner;

public class p005ReverseNumerUsingSrtingBuilder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to reverse : ");
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();
        int reverse = Integer.parseInt(sb.toString());
        System.out.print("reverse number :" + reverse);
    }
}
