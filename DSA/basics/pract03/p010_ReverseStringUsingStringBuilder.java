package basics.pract03;

public class p010_ReverseStringUsingStringBuilder {
    public static void main(String[] args){
        String input = Utility.getString();
        StringBuilder sb = new StringBuilder(input);
        String rev = sb.reverse().toString();
        System.out.print("\n Reverse string is : " + rev);
    }
}
