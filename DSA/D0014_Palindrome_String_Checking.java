import java.util.Scanner;

public class D0014_Palindrome_String_Checking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word to check it is palindrome or not : ");
        String input = sc.next();
        String rev = "";
        for(int i = input.length()-1; i >= 0; i--){
            rev = rev + input.charAt(i);
        }
        if(input.equals(rev)){
            System.out.println( input + " it's a palindrome word ");
        }else {
            System.out.println("enterd number is NOT palindrome");
        }
    }
}
