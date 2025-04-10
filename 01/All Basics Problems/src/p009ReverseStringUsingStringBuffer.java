import java.util.Scanner;

public class p009ReverseStringUsingStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string to reverse :");
        String str = sc.next();
        StringBuffer sb = new StringBuffer(str);
        String rev = sb.reverse().toString();
        System.out.print("reverse string is :  " + rev );
    }
}
