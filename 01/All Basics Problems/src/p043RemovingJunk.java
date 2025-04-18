import java.util.Scanner;

public class p043RemovingJunk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array : ");
        String st = sc.nextLine();
        System.out.print("entered array is : " + st);
        st = st.replaceAll("[^0-9A-Za-z]" , "");
        System.out.print("\n clean String is: " +st);
    }
}
