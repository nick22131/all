package basics.pract04;

import java.util.Arrays;

public class p038_LinearSearchString {
    public static void main(String[] args) {
        String input = Utility.getString();
        char[] array = input.toCharArray();
        System.out.println("Entered String is array is: " + Arrays.toString(array)  );
        System.out.println("Entered char ");
        char target = Utility.getChar();
        boolean isFound = linearSearch(input,target);
        System.out.println("char found at  : " + isFound);
    }

    static boolean linearSearch(String input, char target){
        if(input.isEmpty()){
            return false;
        }
        for(char n : input.toCharArray()){
            if(target == n){
                return true;
            }
        }
        return false;
    }
}
