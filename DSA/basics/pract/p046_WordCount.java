package basics.pract;

import java.util.Scanner;

public class p046_WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence to count words : ");
        String input = sc.nextLine();
        String [] element= input.split(" "  );
        System.out.print("\n Word Count : " + element.length);
    }
}
