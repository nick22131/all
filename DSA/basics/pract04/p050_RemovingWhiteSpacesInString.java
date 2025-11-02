package basics.pract04;

public class p050_RemovingWhiteSpacesInString {
    public static void main(String[] args){
        String input = Utility.getStringLine();
        String clean = input.replaceAll("\\s","" );
        System.out.print("\n cleaned : " + clean);
    }
}
