import java.util.Scanner;

public class p008ReverseStringUsingFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter String to reverse:");
        String st = sc.next();
        String rev = "" ;
        for (int i = st.length() -1 ; i >= 0; i-- ){
            rev = rev + st.charAt(i);
        }
        System.out.print("reverse Strinhh is : "+ rev);



    }
}
