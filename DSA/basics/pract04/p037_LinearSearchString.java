package basics.pract04;

public class p037_LinearSearchString {
    public static void main(String[] args) {
        String input = Utility.getString();
        System.out.print("Entered String is: " + input);
        System.out.println("Enter char to get it's index ");
        char target = Utility.getChar();
        boolean isFound = linearSearch(input, target);
        System.out.println("is found : " + isFound);
    }
    static boolean linearSearch(String input , char target){
        if(input.length() == 0){
            return false;
        }
        for (int i = 0; i < input.length() ; i++) {
            if(input.charAt(i) == target){
                return true;
            }

        }
        return false;
    }
}
