import java.util.Random;
import java.util.Scanner;

public class D0007_Reverse_String_using_For {
    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n enter a String to reverse :   ");
        String st = sc.next();
        String reverse = "";
        for (int i = st.length() - 1 ; i >= 0 ; i--){
            reverse = reverse + st.charAt(i);
        }
        System.out.print("\n reverse String is : " + reverse);
    }
}
