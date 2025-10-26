package basics.pract03;

public class p015_PalindromeNumChecking {
    public static void main(String[] args){
        int input = Utility.getNumber();
        int org = input;
        int rev =0;
        while (input > 0)  {
            int digit = input % 10;
            rev = rev * 10 + digit ;
            input = input / 10;
        }
        if(rev == org ){
            System.out.print("Palindrom Yes ");
        }else{
            System.out.print("not Palindrome");
        }
    }
}
