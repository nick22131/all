package basics.pract05;

public class p011_ReverseStringUsingStringBuffer {
    public static void main(String[] args){
        String input = Utility.getString();
        StringBuffer sb  = new StringBuffer(input);
        sb.reverse();
        System.out.print("\n reverse one is : " + sb.toString());
    }
}
