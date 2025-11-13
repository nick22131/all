package basics.pract05;

public class p010_ReverseStringUsingStringBuilder {
    public static void main(String[] args){
        String input = Utility.getString();
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.print("\n Reverse : " + sb.toString());
    }
}
