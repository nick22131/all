package basics.pract04;

public class p016_PalindromeNumChecking {
    public static void main(String[] args){
        int input = Utility.getNumber();
        int org = input ;
        int rev = 0;
        while(input > 0){
            int digit = input % 10;
            rev = rev * 10 + digit ;
            input = input / 10;
        }
        if(org == rev){
            System.out.print("It is Palindrome");
        }else{
            System.out.print("Not Palindrome");
        }
    }
}
