package basics.pract06;

public class p006_ReverseNumUsingStringBuilder {
    public static void main(String[] args){
        int input = Utility.getNum();
        StringBuilder sb = new StringBuilder(String.valueOf(input));
        sb.reverse();
        int rev = Integer.parseInt(sb.toString());
        System.out.print("\n rev : " + rev);
    }
}
