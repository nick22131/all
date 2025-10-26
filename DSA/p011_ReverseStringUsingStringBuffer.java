import basics.pract03.Utility;

public class p011_ReverseStringUsingStringBuffer {
    public static void main(String[] args){
        String input = Utility.getString();
        StringBuffer sb = new StringBuffer(input);
        String rev = sb.reverse().toString();
        System.out.print("Reverse String is: " + rev);
    }
}
