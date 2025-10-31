package basics.pract04;

public class p011_ReverseStringUsingStringBuffer {
    public static void main(String[] args) {
        String input = Utility.getString();
        StringBuffer sb = new StringBuffer(input );
        String rev = sb.reverse().toString();
        System.out.print("\n Rev is : " + rev);
    }
}
