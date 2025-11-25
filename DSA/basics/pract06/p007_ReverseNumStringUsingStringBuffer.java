package basics.pract06;

public class p007_ReverseNumStringUsingStringBuffer {
    public static void main(String[] args){
        int input  = Utility.getNum();
        StringBuffer sb = new StringBuffer(String.valueOf(input));
        sb.reverse();
        int rev = Integer.parseInt(sb.toString());
        System.out.print("\n reverse is : " + rev   );
    }
}
