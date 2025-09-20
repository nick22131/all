package basics;

import java.util.Scanner;

public class p044_RemovingWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to Clean: " );
        String input = sc.nextLine();
        System.out.print("\n Entered String is : " + input );
        String cleaned = input.replaceAll("\\s","");
        System.out.print("\n cleaned String is : " + cleaned);
    }
}
