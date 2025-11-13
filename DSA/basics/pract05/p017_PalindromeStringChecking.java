package basics.pract05;

public class p017_PalindromeStringChecking {
    public static void main(String[] args){
        String input = Utility.getString();
        String rev  = "";
        for(int i = input.length()-1 ; i >= 0; i--){
            rev = rev + input.charAt(i);
        }
        if(input.equals(rev)){
            System.out.print("\n Palindrome");
        }else{
            System.out.print("\n Not Palindrome");
        }
    }
}
