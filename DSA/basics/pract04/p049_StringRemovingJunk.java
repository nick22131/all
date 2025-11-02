package basics.pract04;

public class p049_StringRemovingJunk {
    public static void main(String[] args){
        String input = Utility.getStringLine();
        String clean = input.replaceAll("[^0-9a-zA-Z]","");
        System.out.print("\n Cleaned : " +clean);
    }
}
