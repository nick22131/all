package basics.pract04;

public class p006_ReverseNumUsingStringBuilder {
    public static void main(String[] args){
        int input = Utility.getNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(input));
        sb.reverse();
        int rev = Integer.parseInt(sb.toString());
        System.out.print("\n rev Num is: " + rev);
    }
}
