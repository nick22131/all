import java.util.Scanner;

public class D0005_Reverse_Number_Using_StringBuffer {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to reverse: ");
        int num = sc.nextInt();
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        sb.reverse();
        System.out.print("\n reverse number is : " + sb.toString());
    }
}
