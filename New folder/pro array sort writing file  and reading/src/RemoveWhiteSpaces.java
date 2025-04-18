import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter array : ");
        String s = sc.nextLine();
        System.out.print(" array is " + s );
        s = s.replaceAll("\\s" , "");
        System.out.print( " without spaces : " + s);


    }
}
