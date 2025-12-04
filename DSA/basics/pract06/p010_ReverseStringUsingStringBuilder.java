package basics.pract06;

public class p010_ReverseStringUsingStringBuilder {
    public static void main(String[] args){
        String input = Utility.getString();
        StringBuilder sb = new StringBuilder(input) ;

        System.out.print("\n rev is : " + sb.reverse().toString());
    }
}
