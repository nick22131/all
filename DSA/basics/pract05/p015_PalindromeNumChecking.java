package basics.pract05;

public class p015_PalindromeNumChecking {
    public static void main(String[] args){
        int input = Utility.getNum();
        int org = input;
        int rev = 0;
        while(input > 0){
            int digit = input % 10;
            rev = rev * 10 + digit;
            input = input / 10;
        }
        if(rev == org){
            System.out.print("\n Palindrome ");
        }else{
            System.out.print("\n Not Palindrome");
        }
    }
}
