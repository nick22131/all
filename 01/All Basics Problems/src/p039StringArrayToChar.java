import java.util.Arrays;
import java.util.Scanner;

public class p039StringArrayToChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter string seperated by spaces (e.g., 'a b c ') ");
        String input = sc.nextLine();
        String[] ele = input.split(" ");
        char[] a = new char[ele.length];
        for(int i = 0 ; i < ele.length; i++){
            a[i] = ele[i].charAt(0);
        }
        System.out.print(" Character in array is: " + Arrays.toString(a));
    }
}
