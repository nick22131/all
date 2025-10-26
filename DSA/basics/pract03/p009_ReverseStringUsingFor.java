package basics.pract03;

public class p009_ReverseStringUsingFor {
    public static void main(String[] args){
        String input = Utility.getString();
        String rev = "";
        for (int i = input.length() - 1 ; i >= 0 ; i--) {
            rev = rev + input.charAt(i);
        }
        System.out.print("\n reverse String is :  " + rev);
    }
}
