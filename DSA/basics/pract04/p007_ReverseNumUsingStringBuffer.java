package basics.pract04;

public class p007_ReverseNumUsingStringBuffer {
    public static void main (String[] args){
        int input = Utility.getNumber();
        StringBuffer sb = new StringBuffer(String.valueOf(input));
        sb.reverse();
        int rev = Integer.parseInt(sb.toString());
        System.out.print("\n Reverse Num is : " + rev);
    }
}
