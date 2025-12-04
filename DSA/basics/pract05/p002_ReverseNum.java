package basics.pract05;

public class p002_ReverseNum {
    public static void main(String[] args){
        int input = Utility.getNum();
        int rev = 0;
        while(input != 0){
            int digit = input % 10;
            rev = rev * 10 + digit;
            input = input/10;
        }
        System.out.print("\n rev is : " + rev);
    }
}
