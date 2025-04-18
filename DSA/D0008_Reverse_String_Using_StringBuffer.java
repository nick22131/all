import java.util.Scanner;

public class D0008_Reverse_String_Using_StringBuffer {
    public static void main (String[ ] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n enter a string to reverse : ");
        String input = sc.next();
        StringBuffer sb = new StringBuffer(input);
        String reverse = sb.reverse().toString();
        System.out.print("\n Reverse String is : " + reverse)   ;
    }
}
