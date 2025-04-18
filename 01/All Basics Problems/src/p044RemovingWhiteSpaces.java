import java.util.Scanner;

public class p044RemovingWhiteSpaces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array is : ");
        String st = sc.nextLine();
        System.out.print("entered array is : " +st );
        st = st.replaceAll("\\s","");
        System.out.print("\n without spaces : " + st);

    }
}
